// ARMAZENANDO OS IDS EM VARIAVES

var answers = {};

var question_one = document.getElementById('question-1');
var question_two = document.getElementById('question-2');
var question_three = document.getElementById('question-3');
var question_four = document.getElementById('question-4');
var question_five = document.getElementById('question-5');

// CRIANDO A PRIMEIRA FUNÇÃO DENTRO DE ANSWERS POIS AINDA ESTA VAZIO

function storeAnswer(question_number, event){
    // CHAMANDO APENAS OS ELEMENTOS DO TIPO RADIO
    if(event.target.type === 'radio'){ //USAMODS "===" PORQUE QUEREMOS QUE SEJA EXATAMENTE IGUAL A RADIO.
    // ASSIM QUE ELE FOR DESPARADO ELE IRÁ FAZER A PROXIMA AÇÃO:
    console.log(event.target.value); //SEMPRE QUE DISPARAR UM EVENTO O VALUE SERÁ COLOCADO LA
    
    // CRANDO UMA ARRAY
    // QUEREMOS QUE OBRIGATORIAMENTE SEJA UM ELEMENTO INTEIRO, POIS AUTOMATICAMENTE ELE ENTENDE COMO STRING
    answers['question'+question_number] = parseInt(event.target.value);
    console.log(answers);
    }
}

// ADICIONANDO UM EVENTO DE CLICK

question_one.addEventListener('click', function(event){
    storeAnswer(1, event)
})
question_two.addEventListener('click', function(event){
    storeAnswer(2, event)
})
question_three.addEventListener('click', function(event){
    storeAnswer(3, event)
})
question_four.addEventListener('click', function(event){
    storeAnswer(4, event)
})
question_five.addEventListener('click', function(event){
    storeAnswer(5, event)
})

// CRIANDO UMA FUNÇÃO PARA ARMAZENAR NOSSO TOTAL SCORE

function totalScore(){
    // DECRETANDO SUA VARIAVEL
    var total_score =   //ELA VAI ARMAZENAR NOSSAS QUESTIONS
    answers.question1+
    answers.question2+
    answers.question3+
    answers.question4+ 
    answers.question5; //SEMPRE ACRESCENTANDO VALORES PARA NOSSO TOTAL SCORE

    return total_score;
}

// DEFININDO A RESPOSTA QUE VAI RECEBER DE ACORDO COM O SCORE

function getInfoBasedOnScore(){
    // O () AINDA ESTA VAZIO POIS ESTA ESPERANDO O VALOR DO USUSARIO
    if(totalScore() < 7){
        var score_info = "Recomendamos que realize as tarefas de nivel 1 primeiros, para depois ir avançando!";
    } else if(totalScore() > 7){
        var score_info = "Parabéns! voce possui está no nivel 3! Continue assim. <br> agora clique no botão abaixo para continuarmos nossos estudos!"
    }

        // DEPOIS ADICIONE MAIS UM AQUI

    //  AQUI IRÁ RETORNAR COM O RESULTADO NA TELA

    return score_info;

     }

    //  ARMAZENANDO O SUBMIT DENTRO DE VARIAVEIS

    var submit1 = document.getElementById('submit1');
    var submit2 = document.getElementById('submit2');
    var submit3 = document.getElementById('submit3');
    var submit4 = document.getElementById('submit4');
    var submit5 = document.getElementById('submit5');

    // FUNÇÃO PARA QUE PASSE DE QUESTÃO EM QUESTÃO SEM QUE FIQUE UMA SOBRE A OUTRA

    function nextQuestion(question_number){
        // SEMPRE PEGARÁ A QUESTÃO CORRENTE QUE SEMPRE SERÁ -1
        var current_question_number = question_number - 1;
        var question_number = question_number.toString();
        var current_question_number = current_question_number.toString();
        // COMEÇANDO A MANIPULAR A MENEIRA EM QUE SERÁ EXIBIDO FAZENDO COM QUE A QUESTION NUMBER FIQUE INVISEVEL E A 2 VISIVEL.
        
        var el = document.getElementById('question-'+question_number);
        var el2 = document.getElementById('question-'+current_question_number);

        // ASSIM UM APARECERÁ E O OUTRO NAO

        el.style.display = "block";
        el2.style.display = "none";
    }

    // EVENTO EM ADA BOTAO

    // QUANDO CLICAR EM SUBMIT NA QUESTION1 AUTOMATICAMENTE SERÁ ENVIADO PARA A QUESTION2
    submit1.addEventListener('click', function(){
        nextQuestion(2);

        // BAARRA DE PROGRESSO
        // ONDE A CADA SUBMIT ELA AUMENTARÁ 20%
        growProgressBar('40%');
    })

    submit2.addEventListener('click', function(){
        nextQuestion(3);
        growProgressBar('60%');
    })

    submit3.addEventListener('click', function(){
        nextQuestion(4);
        growProgressBar('80%');
    })

    submit4.addEventListener('click', function(){
        nextQuestion(5);
        growProgressBar('100%');
    })

submit5.addEventListener('click', function(){
    nextQuestion(6);
})

    // PASSO FINCAL

    submit5.addEventListener('click', function(){
        document.getElementById("printtotalscore").innerHTML = totalScore();
        document.getElementById("printscoreinfo").innerHTML = getInfoBasedOnScore();
    })


    // ONDE APARECERÁ NOSSA PROGRESS BAR

    function growProgressBar(percentage_width){
        var bar = document.getElementById("progress_bar");
        bar.style.width = percentage_width;
    }