# Testando-Rsocket

Essa aplicação tem o objetivo de testar o protocolo Rsocket.

O Rsocket é um protocolo binário que foi desenvolvido por engenheiros da Netflix com o objetivo inicial de oferecer performance em escala e velocidade,
e que supera o protoco HTTP em diversos aspectos. Os Seus desenvolvedores, sairam da Netflix, mas deram continuidade ao projeto no Facebook.
Entre algumas de suas carácteristicas importantes estão:

- Suporte a comunicação bidirecional de maneira adequada.

-Suporta diversos padrões de troca de informação/mensagens,
 além do básico request/response.
 
 -Assim como tokens, ele suporta metadatas para propagar informações fora da banda (out-of-band-information).
 
 -ele reifica os conceitos de especificação do Reactive Streams no nível do protocolo de rede
 
 -Tem um .io , que é um bom domínio que é um dos fundamentos para o sucesso das tecnologias destinadas à cloud

É possível integrar o Rsocket em projetos Spring boot.
 É possível saber um pouco mais a respeito do  protocolo Rsocket e sua aplicação em projetos Spring em https://spring.io/blog/2021/01/18/ymnnalft-easy-rpc-with-rsocket
 Neste artigo Josh Long(Spring Developer Advocate), traz seu ponto de vista em relação ao projeto de maneira descontraída, Enfatizando a superioridade do protocolo Rsocket aplicado em microservices, 
 comparando-o aos protocolos mais comuns atualmente.
 
 para rodar o projeto é necessário ter o rsc instalado que pode ser encontrado no repositório no github:
 
 https://github.com/making/rsc
 
 Basta seguir as instruções de instalação do repositório. 
 
 Obs; No meu caso, não foi necessário clonar o repositório rsc, fiz a instalação pelo Homebrew. E recomendo o mesmo caso tenha um SO Baseado no Linux (Não sei se existe homebrew para outros SO).
 Se for fazer a instalação do Homebrew, recomendo procurar um tutorial, pois é necessário fazer algumas configurações de Bash e Path. Que podem ser um pouco confusas. Mas basta ler todas as informações e instruções que surgem durante a instalação que não haverá problemas.
 
 Tendo o rsc instalado, basta rodar a aplicação e rodar o comando abaixo no terminal:
 
 rsc tcp://localhost:8888  -r greetings.en -d 'SeuNome'
 
 se tudo der certo a saída deve ser:
 
 Hello, SeuNome!
 
 Caso queira 'codar na mão', aconselho seguir o procedimento passado por Josh, no artigo citado e linkado acima. 

A aplicação é apenas par fins de teste e observação do funcionamento do protocolo, portanto, não é construída com a intenção de trazer nenhuma complexidade ou classe de grande expressão.