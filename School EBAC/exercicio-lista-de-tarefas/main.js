$(document).ready(function(){

    $('button').click(function(e){
        e.preventDefault();
        
        const novaTarefa = $('#adicionar-tarefa').val();
        const novoItem = $('<li></li>').text(novaTarefa);
        $('#lista').append(novoItem);
    });

    //Adicionar o efeito de linha do texto ao clicar

    $('#lista').on('click', 'li', function(){
        $(this).toggleClass('concluido')
    })

});
