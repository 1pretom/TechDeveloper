const numeros =[1,2,3,4,5]
const resultado = numeros.filter((itens)=> itens <3)
//filtrando 
console.log(resultado)
const total = numeros.reduce((numeros, sum) => numeros+sum)
//operando
console.log(total)
const numerosAoQuadrado = numeros.map((numero)=> numero*numero)
console.log(numerosAoQuadrado)
//map serve para manipular os itens e ter um retorno deles

const usuarios = [
    {
        nome: "Wash",
        idade: 26
    },
    {
        nome: "João",
        idade: 17
    },{
        nome: "Carlos",
        idade: 23
    },{
        nome: "Luis",
        idade: 19
    }
]

const result = usuarios.filter((usuario)=> usuario.idade>=18)
console.log(result)

const soma = usuarios.reduce((somar, usuario)=> usuario.idade + somar,0)
console.log(soma)

const final = usuarios.map((usuario)=>usuario.idade * usuario.idade)
console.log(final)