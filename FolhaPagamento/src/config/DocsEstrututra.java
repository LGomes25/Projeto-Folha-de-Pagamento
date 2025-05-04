package config;

public class DocsEstrututra {

	/*
	 * ├── app           		# Implementação de menu com chamadas de funcionalidades #
	 * | ├── (RodaFolha)		=> Main class 
	 * |
	 * |
	 * ├── config        		# Configurações (Security, Beans, etc.) 				#
	 * | ├── (DocsEstrututra)	=> Armazena estrutura do projeto
	 * |
	 * |
	 * ├── service       		# Lógica de negócios e serviços							#
	 * | ├──(DataProcess)		=> Leitura e verificação de datas
	 * | ├──(ExportFileCsv)		=> Exportação de dados .csv
	 * | ├──(FolhaPagamento)	=> Calculos das folhas de pagamento
	 * | ├──(ImportFileCsv)		=> Importação de dados .csv
	 * | ├──(ListFuncTest)		=> carrega dados pré-instanciados
	 * |
	 * |
	 * ├── repository    # Acesso a banco de dados (JPA, JDBC, DAOs)
	 * |
	 * |
	 * ├── model       			# Entidades e DTOs										#
	 * | ├──(Dependente)		=> Objeto com informações sobre dependentes
	 * | ├──(Funcionario)		=> Objeto com informações sobre Funcionarios
	 * | ├──(Pessoa)			=> Objeto não instanciavel, SuperClass Abstract
	 * |
	 * |
	 * ├── exception     		# Tratamento de exceções
	 * | ├──(InvalidaData)		=> Critica datas erradas
	 * | ├──(InvalidaCpf)		=> Critica CPF duplicado
	 * | ├──(InvalidaDep)		=> Critica Dependentes com mais de 18anos
	 * | ├──(InvalidaCaracter)	=> Critica Inserção de caracteres inválidos
	 * |
	 * |
	 * ├── util          		# Utilitários e classes auxiliares						#
	 * | ├──(InssDescEnum)		=> Enum com valores tabela INSS - 2025
	 * | ├──(IrDescEnum)		=> Enum com valores tabela IR - 2025
	 * | ├──(Menu)				=> Métodos executáveis do menu (encapsulamento)
	 * | ├──(TipoDep)			=> Enum de dependentes
	 * | ├──(ValidaCpf)			=> Interface para validação de CPF
	 * | ├──(ValidaDependente)	=> Interface para validação de idade de dependente
	 * 
	 */
	
}
