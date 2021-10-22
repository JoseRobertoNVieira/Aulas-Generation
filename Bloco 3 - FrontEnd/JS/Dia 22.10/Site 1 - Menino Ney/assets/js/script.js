let nome = window.document.getElementById('nome');
let email = window.document.getElementById('email');
let assunto = window.document.getElementById('assunto');
let nomeOk = false
let emailOk = false
let assuntoOk = false

nome.style.width = '78%'
email.style.width = '78%'
assunto.style.width = '80%'

function validaNome() {
    let txtNome = document.querySelector('#txtNome')
    if (nome.value.length <3) {
        txtNome.innerHTML = 'Nome Inválido'
        txtNome.style.color = '#722F37'
    } else {
        txtNome.innerHTML = 'Nome Válido'
        txtNome.style.color = 'green'
        nomeOk = true
    } 
}

function validaEmail() {
    let txtEmail = document.querySelector('#txtEmail')
    
    if (email.value.indexOf('@' && '.com') == -1) {
        txtEmail.innerHTML = 'E-mail Inválido'
        txtEmail.style.color = '#722F37'
    } else {
        txtEmail.innerHTML = 'E-mail Válido'
        txtEmail.style.color = 'green'
        emailOk = true
    }
}   

function validaAssunto() {
    let txtAssunto = document.querySelector('#txtAssunto')

    if(assunto.value.length >= 100) {
        txtAssunto.innerHTML = 'O máximo de caracteres permitido é 100!'
        txtAssunto.style.color = '#722F37'
    } else {
        txtAssunto.innerHTML = ' '
        assuntoOk = true
    }

}
function enviar() {
    if (nomeOk == true && emailOk == true && assuntoOk == true) {
        alert ('Formulário enviado com sucesso!')
    } else {
        alert ('Preencha todos os campos corretamente antes de enviar o formulário!')
    }
}