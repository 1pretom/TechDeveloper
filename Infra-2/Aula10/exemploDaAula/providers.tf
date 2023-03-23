# Declaramos o Cloud Provider com o qual iremos trabalhar


terraform {
# Indicamos o que queremos:
# a. a versão do binário da terraform maior ou igual a 0.12
 required_version = ">=0.12"
 required_providers {
   aws = {
# Especificamos a partir de onde queremos descarregar o binário:  
     source = "hashicorp/aws"
# Indicamos-lhe que ele irá permitir apenas:ma	
# b. a versão do binário do provider 3.20.0 (com certa restrição)
     version = "~> 3.20.0"
   }
 }
}
# ==================================================================


# ==================================================================
# Declaramos a região onde queremos montar nossa infra


provider "aws" {
 shared_credentials_file = "~/.aws/credentials"
 region = "us-east-1"
}
# ==================================================================
