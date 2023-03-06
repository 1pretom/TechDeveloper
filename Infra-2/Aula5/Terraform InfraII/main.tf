provider "aws" {

    region = "us-east-2"
    access_key = "AKIA55K2OABUDT2PJX7Y"
    secret_key = "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"

}
resource "aws_instance" "nome_recurso_terraform" {

    count = 10
    ami = "0557a15b87f6559cf"
    instance_type = "t2.micro"
    key_name = "chave_acesso"
    tags = {
    "Name" = "wash-${count.index}"
    }

}

resource "aws_key_pair" "chave_acesso" {

    key_name = "chave_acesso"
    public_key = file("chave_acesso.pem")
  
}