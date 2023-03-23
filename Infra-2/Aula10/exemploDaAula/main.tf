# Criamos nosso VPC
resource "aws_vpc" "Main" {                
# usamos o bloco "resource", o "provider element" e um "rótulo"
 cidr_block = var.main_vpc_cidr     
# passamos para ele, como variável, o CIDR block que queremos que utilize 
 instance_tenancy = "default"
 tags = {
 Name = "My_VPC"
 }
}
# ==================================================================
# Criamos um Internet Gateway "Y" e o associamos ao VPC que acabamos de criar 
resource "aws_internet_gateway" "IGW" {    
# Internet Gateway
 vpc_id =  aws_vpc.Main.id              
# vamos conhecer o vpc_id somente quando o VPC tenha sido criado
 tags = {
 Name = "IGW"
 }
}
# ==================================================================
# Criamos a subnet pública
resource "aws_subnet" "public_subnets" {    
# criamos as subnets públicas
 vpc_id =  aws_vpc.Main.id
 cidr_block = var.public_subnets        
# CIDR block para minhas public subnets
 tags = {
 Name = "Public Subnet"
 }
}
# ==================================================================
# Criamos a subnetprivada    
# criamos nossas private subnets
resource "aws_subnet" "private_subnets" {
 vpc_id =  aws_vpc.Main.id
 cidr_block = var.private_subnets          
# CIDR block para minhas subnets privadas
 tags = {
   Name = "Private Subnet"
 }
}
# ==================================================================
# Tabela de roteamento para a subnet pública
resource "aws_route_table" "Public_RT" {    
# Criamos nosso Route Table para a subnet pública
 vpc_id =  aws_vpc.Main.id
 route {
   cidr_block = "0.0.0.0/0"               
# Declaramos o tráfego da sub-rede pública para a Internet a partir do Internet Gateway
   gateway_id = aws_internet_gateway.IGW.id
 }
 tags = {
   Name = "Tabela de Roteamento pública"
 }
}
# ==================================================================
# Tabela de roteamento para a subnet privada
resource "aws_route_table" "Private_RT" {   
 # Creating RT for Private Subnet
 vpc_id = aws_vpc.Main.id
 route {
   cidr_block = "0.0.0.0/0"             
# Tráfego proveniente das subnet privadas chegando na Internet via NAT Gateway
   nat_gateway_id = aws_nat_gateway.NAT_GW.id
    }
 tags = {
 Name = "Tabela de Roteamento Privada"
 }
}
# ==================================================================
# Associação da tabela de roteamento à subnet pública 
resource "aws_route_table_association" "Public_RT_Association" {
   subnet_id = aws_subnet.public_subnets.id
   route_table_id = aws_route_table.Public_RT.id
}
# ==================================================================
# Associação da tabela de roteamento à subnet privada
resource "aws_route_table_association" "Private_RT_Association" {
   subnet_id = aws_subnet.private_subnets.id
   route_table_id = aws_route_table.Private_RT.id
}
resource "aws_eip" "NAT_EIP" {
 vpc   = true
 tags = {
 Name = "NAT com elastic IP"
 }
}
# ==================================================================
# Criação do NAT Gateway usando subnet_id e allocation_id
resource "aws_nat_gateway" "NAT_GW" {
 allocation_id = aws_eip.NAT_EIP.id
 subnet_id = aws_subnet.public_subnets.id
 tags = {
   Name = "NAT Gateway alocada à subnet pública"
 }
}
