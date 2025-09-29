🎬 ScreenMatch – Java + OMDb API Series Analyzer

Aplicação em Java que consome a API pública OMDb
 para buscar séries e analisar seus episódios por temporada. O projeto aplica conceitos de orientação a objetos, API REST, Streams, tratamento de dados e boas práticas com record, Map, List, Optional, Stream API e mais.

📸 Preview
<p align="center"> <img src="ad403299-55fd-4280-832c-13e50dd7a696.png" alt="ScreenMatch Estrutura do Projeto" width="600"/> </p>
🚀 Funcionalidades

✅ Busca de séries por nome (API OMDb)

📥 Consulta automática de todas as temporadas e episódios

🧾 Impressão de dados formatados (título, temporada, avaliação, data)

📊 Estatísticas:

Top 10 episódios por avaliação

Agrupamento de episódios por temporada

Média, pior e melhor avaliação

🔍 Filtro de episódios por título ou data

🔄 Mapeamento de dados usando Stream, record e Collector

🧩 Tratamento de erros e dados inválidos (N/A, datas faltantes etc.)

🧠 Tecnologias e Conceitos

Java 17+

Consumo de API REST com HttpClient

Jackson para serialização JSON → record

POO (Abstração, Encapsulamento, etc.)

Java Streams & Lambda Expressions

Tratamento de exceções (try/catch)

Boas práticas com record + classes POJO

Integração com OMDb API

🗃️ Estrutura do Projeto
📁 screenmatch
├── 📁 main
│   └── 📁 java
│       └── 📦 br.com.alura.screenmatch
│           ├── 📁 model
│           │   ├── DadosEpisodio.java
│           │   ├── DadosSerie.java
│           │   ├── DadosTemporada.java
│           │   └── Episodio.java
│           ├── 📁 service
│           │   ├── ConsumoApi.java
│           │   ├── ConverteDados.java
│           │   └── IConverteDados.java
│           ├── 📁 principal
│           │   └── Main.java
│           └── ScreenmatchApplication.java
└── 📁 test
    └── br.com.alura.screenmatch
        └── ScreenmatchApplicationTests.java

📦 Como rodar o projeto

Clone o repositório:

git clone https://github.com/seuusuario/screenmatch.git


Abra no IntelliJ IDEA ou VS Code com suporte Java.

Substitua a chave de API no arquivo Main.java:

private final String API_KEY = "&apikey=6585022c"; // Troque pela sua


Execute a classe Main.java

🛠️ Exemplo de uso

Ao executar:

Digite o nome da série para busca:
Breaking Bad


A aplicação:

Consulta todos os episódios da série

Ordena pela nota no IMDb

Retorna os 10 melhores episódios

Mostra estatísticas e agrupamentos por temporada

🔧 Possíveis melhorias

 Interface gráfica com JavaFX ou Swing

 Testes unitários com JUnit

 Exportar dados para .csv

 Filtrar por gênero, idioma ou ator

 Suporte a filmes

📚 Sprint Planning

Você pode criar seções como:

### 🏃 Sprint 1 – Módulo base
- Estrutura inicial do projeto
- Consumo da API OMDb
- Criação de model `record` e `POJO`

### 🔍 Sprint 2 – Processamento e análise
- Filtro por episódios
- Cálculo de estatísticas com `Stream`
- Tratamento de exceções

### 🎨 Sprint 3 – Interface e melhorias
- Adição de testes
- Criação de visualização no terminal
- Exportações e persistência

📜 Licença

Este projeto está licenciado sob a licença MIT. Veja o arquivo LICENSE
 para mais detalhes.

Se quiser, posso:

💡 Gerar imagens de fluxo da aplicação (Ex: Fluxo da API → Model → Stream)

📐 Criar um diagrama UML simples

📋 Gerar mensagens de commit padrão para cada módulo/sprint

🗂️ Ajudar a criar issues no GitHub com os cards das tarefas

