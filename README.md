<h3>Projeto que simular algumas das funções do Instagram:</h3>

<p>Nele podemos postar fotos, vídeos, curtir e comentar.</p>

<p>A fim de oferecer melhorar o armazenamento e visualização dos posts pelos usuários, foi feito o uso da abordagem de file store:</p>
<p>Ao adicionar um novo post, são salvos apenas a quantidade de curtidas, comentários e um link que leva para a exibição da imagem. Esta, está armazenada em um serviço de nuvem chamado <a href="https://cloudinary.com/">Cloudinary</a>.</p> 
<p>Aliás o banco de dados está hospedado na nuvem através do <a href="https://www.elephantsql.com/">ElephantSQL</a>.</p>

<h3>Rodando projeto localmente:</h3>
<p>na pasta do projeto no promt de comando, digite:</p>
<p><b>mvn spring-boot:run</b></p>

<h3>Requisições:</h3>

<h4>GET: localhost:8080/<h4>
<p>Exibe todos os posts no formato:</p>

```json
{ 
    "id": 1, 
   "pathFile": "http://res.cloudinary.com/dildbjrev/image/upload/0a36ded6-f", 
   "curtida": "1", 
   "comentario": "teste com elephant sql" 
}
```

<h4>GET By Id: localhost:8080/ID</h4>
<p>Mostra um post em específico</p>

<h4>POST: localhost:8080/upload</h4>
<p>Corpo da requisição:</p>

```json
{
    "pathFile" : "local do arquivo + nome do arquivo (ex:C:\\Users\\Usuario\\images\\imagem.jpg)",
    "curtida" : "1",
    "comentario" : "comentário"
}
```

<h4>PUT: localhost:8080/ID</h4>
<p>Corpo da requisição:</p>
<p>(Apenas as curtidas e os comentários podem sofrer alteração)</p>

```json
{
    "curtida" : "1",
    "comentario" : "comentário"
}
```

<h4>DELETE: localhost:8080/ID</h4>
<p>Delete um post pelo ID</p>
