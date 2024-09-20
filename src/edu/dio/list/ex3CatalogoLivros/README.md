### Pesquisa em List

#### 3. Catálogo de Livros
Crie uma classe chamada **`CatalogoLivros`** que possui uma lista de objetos do tipo **`Livro`** como atributo. Cada livro possui atributos como título, autor e ano de publicação. Implemente os seguintes métodos:

- **`adicionarLivro(String titulo, String autor, Year* anoPublicacao)`**: Adiciona um livro ao catálogo.
- **`pesquisarPorAutor(String autor)`**: Pesquisa livros por autor e retorna uma lista com os livros encontrados.
- **`pesquisarPorIntervaloAnos(Year* anoInicial, Year* anoFinal)`**: Pesquisa livros publicados em um determinado intervalo de anos e retorna uma lista com os livros encontrados.
- **`pesquisarPorTitulo(String titulo)`**: Pesquisa livros por título e retorna o primeiro livro encontrado.

> *Como adicinoal de complexidade, alterei a regra de negócio para, em vez de receber um `int`, receber um `Year`"

---