let form = document.getElementById('validacaoFinal')

function formVal(){
    let campoA = document.getElementById('CampoA')
    let campoB = document.getElementById('CampoB')

    if (campoA.value < campoB.value){
        alert ('Seu formulário não é valido!')
    } else{
        alert ('Seu formulário é válido');
    }
}


form.addEventListener('submit',function(e){
    e.preventDefault();
    formVal();
})