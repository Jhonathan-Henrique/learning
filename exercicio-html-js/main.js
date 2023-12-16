const form = document.getElementById('form-validacao')

function validaFormulario(){
    let numeroA = document.getElementById('numeroA')
    let numeroB = document.getElementById('numeroB')
    if (numeroA.value < numeroB.value) { 
        alert ('Seu formulario e valido') 
    } else {
        alert ('Seu formulario nao e valido')
    }
}

form.addEventListener('submit', function(e){
    e.preventDefault();

    validaFormulario();
})