
		$(document).ready(function () {

			//Esconde todos os passos e exibe o primeiro ao carregar a página 
			$('.step').hide();
			$('.step').first().show();

			//Exibe no topo em qual passo estamos pela ordem da div que esta visivel
			var passoexibido = function () {
				var index = parseInt($(".step:visible").index());
				if (index == 0) {
					//Se for o primeiro passo desabilita o botão de voltar
					$("#prev").prop('disabled', true);
				} else if (index == (parseInt($(".step").length) - 1)) {
					//Se for o ultimo passo desabilita o botão de avançar
					$("#next").prop('disabled', true);
				} else {
					//Em outras situações os dois serão habilitados
					$("#next").prop('disabled', false);
					$("#prev").prop('disabled', false);
				}
				$("#passo").html(index + 1);

			};

			//Executa a função ao carregar a página
			passoexibido();

			//avança para o próximo passo
			$("#next").click(function () {
				$(".step:visible").hide().next().show();
				passoexibido();
			});

			//retrocede para o passo anterior
			$("#prev").click(function () {
				$(".step:visible").hide().prev().show();
				passoexibido();
			});

		});

		var avancar = document.querySelector("#next")

		avancar.addEventListener('click', () => {
			event.preventDefault();
		})
