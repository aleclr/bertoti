$(document).ready(function(){


    $("#showEspec").click(function() {
        console.log("clicou no buscaEspec");
        var espec = document.getElementById("painelBusca");
        var preco = document.getElementById("painelBusca2");
        var cadastro = document.getElementById("painelCadastro");

        preco.style.display = "none";
        cadastro.style.display = "none";
        espec.style.display = "block";
        espec.scrollIntoView();

    });

    $("#showPreco").click(function() {
        console.log("clicou no buscaPreco");
        var espec = document.getElementById("painelBusca");
        var preco = document.getElementById("painelBusca2");
        var cadastro = document.getElementById("painelCadastro");

        espec.style.display = "none";
        cadastro.style.display = "none";
        preco.style.display = "block";
        preco.scrollIntoView();

    });

    $("#showCadastro").click(function() {
        console.log("clicou no cadastro");
        var espec = document.getElementById("painelBusca");
        var preco = document.getElementById("painelBusca2");
        var cadastro = document.getElementById("painelCadastro");

        preco.style.display = "none";
        espec.style.display = "none";
        cadastro.style.display = "block";
        cadastro.scrollIntoView();

    });
			

    $("#buscaEspec").click(function() {

        var espec = document.getElementById("painelBusca");
        var tabela = document.getElementById("tabelaCarros");

        tabela.style.display = "table";

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
                
                    itens.push("<tr> <td>"+ this.placa +"</td><td>"+ this.modelo + "</td><td>"+ this.marca + "</td><td>"+ this.cor + "</td><td>" + this.preco + "</td></tr>");
                    
                });
                            
                $("#dadosCarro").append(itens); 
        });

    });

    $("#buscaPreco").click(function() {

        var url = "http://localhost:8080/carros";

        var tabela = document.getElementById("tabelaCarros2");

        if (tabela.style.visibility == "hidden") {
            tabela.style.visibility = "visible"	
        };

        var precoMin = parseInt($("#precoMin").val());
        console.log(precoMin);
        document.getElementById("precoMin").value = "";

        var precoMax = parseInt($("#precoMax").val());
        console.log(precoMax);
        document.getElementById("precoMax").value = "";

        var $parent = $(this).parents('.tbodyPrecos');

        $(".trPreco").remove();

        $.getJSON(url, function(data) {
                
            var itens = [];
            
            $.each(data, function(i){

                if (this.preco >= precoMin && this.preco <= precoMax) {
                    itens.push("<tr class='trPreco'> <td>"+ this.placa +"</td><td>"+ this.modelo + "</td><td>"+ this.marca + "</td><td>"+ this.cor + "</td><td>" + this.preco + "</td></tr>");
                };
                
            });
                        
            $("#dadosCarro2").append(itens);
            
        });

    });

    $("#btnCadastro").click(function() {

        var url = "http://localhost:8080/carros";
        var modelo = $( "#modeloCadastro option:selected" ).text();
        var fabricante = $( "#fabricanteCadastro option:selected" ).text();
        var cor = $( "#corCadastro option:selected" ).text();
        var placa = $("#placaCadastro").val();
        var preco = $("#precoCadastro").val();

        console.log(modelo);
        console.log(fabricante);
        console.log(cor);
        console.log(placa);
        console.log(preco);

        console.log(JSON.stringify({placa: placa, modelo: modelo, marca: fabricante, cor: cor, preco: preco}));

        fetch(url, {
            method: 'POST',
            body: JSON.stringify({placa: placa, modelo: modelo, marca: fabricante, cor: cor, preco: preco})
        })
        .then(response => response.json())
        .then(response => console.log(response))
        .catch(err => console.log(err))

            });

});