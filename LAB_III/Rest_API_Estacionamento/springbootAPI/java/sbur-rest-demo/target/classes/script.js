$(document).ready(function(){


    $("#showEspec").click(function() {
        var espec = document.getElementById("painelBusca");
        var preco = document.getElementById("painelBusca2");

        if (preco.style.display == "block") {
            preco.style.display = "none";
            espec.style.display = "block";
        } else {
            espec.style.display = "block";
        };
    });

    $("#showPreco").click(function() {
        var preco = document.getElementById("painelBusca2");
        var espec = document.getElementById("painelBusca");

        if (espec.style.display == "block") {
            espec.style.display = "none";
            preco.style.display = "block";
        } else {
            preco.style.display = "block";
        };

    });
			

    $("#buscaEspec").click(function() {

        var tabela = document.getElementById("tabelacarros");

        if (tabela.style.visibility == "hidden") {
            tabela.style.visibility = "visible"	
        };

        var modelo = $( "#modelo option:selected" ).text().toLowerCase();
        var marca = $( "#marca option:selected" ).text().toLowerCase();
        var cor = $( "#cor option:selected" ).text().toLowerCase();
            
        $("#dadosCarro").empty();

        console.log(modelo);
        console.log(marca);
        console.log(cor);

        var url;

        if (modelo == "clique e escolha o modelo...") {
            if (marca == "clique e escolha a marca...") {
                if (cor == "clique e escolha a cor...") {
                    url = "http://localhost:8080/carros";
                } else {
                    url = "http://localhost:8080/carros/cor/" + cor;
                }
            } else {
                if (cor == "clique e escolha a cor...") {
                    url = "http://localhost:8080/carros/marca/" + marca;
                } else {
                    url = "http://localhost:8080/carros/marca/" + marca + "/cor/" + cor;
                }
            }
        } else {
            if (marca == "clique e escolha a marca...") {
                if (cor == "clique e escolha a cor...") {
                    url = "http://localhost:8080/carros/modelo/" + modelo;
                } else {
                    url = "http://localhost:8080/carros/modelo/" + modelo + "/cor/" + cor;
                }
            } else {
                if (cor == "clique e escolha a cor...") {
                    url = "http://localhost:8080/carros/modelo/" + modelo + "/marca/" + marca;
                } else {
                    url = "http://localhost:8080/carros/modelo/" + modelo + "/marca/" + marca + "/cor/" + cor;
                }
            }
        }

        console.log(url);
        
            
        // var url = "/carros/"+modelo+"/"+marca+"/"+cor+"";
            

        $.getJSON(url, function(data) {
                
                var itens = [];
                
                $.each(data, function(i){
                
                    itens.push("<tr> <td>"+ this.placa +"</td><td>"+ this.modelo + "</td><td>"+ this.marca + "</td><td>"+ this.cor + "</td></tr>");
                    
                });
                            
                $("#dadosCarro").append(itens);
                
        });

    });

    $("#buscaPreco").click(function() {

        var tabela = document.getElementById("tabelacarros2");
        if (tabela.style.visibility == "hidden") {
            tabela.style.visibility = "visible"	
        };

        var precoMin = parseInt($("#precoMin").val());
        console.log(precoMin);

        var precoMax = parseInt($("#precoMax").val());
        console.log(precoMax);
        

    });

});