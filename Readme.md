# GaugeChartApp

GaugeChartApp é um aplicativo Android simples que utiliza o PointerSpeedometer para exibir um medidor de velocidade personalizável. O usuário pode aumentar ou diminuir a velocidade utilizando botões, e o medidor muda de cor conforme a velocidade.

## Pré-requisitos

Antes de começar, certifique-se de ter o seguinte instalado em sua máquina:

- [Android Studio](https://developer.android.com/studio)
- [JDK (Java Development Kit)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) versão 8 ou superior

## Clonando o Repositório

Clone o repositório para sua máquina local usando o comando:

```bash
git clone https://github.com/seu-usuario/GaugeChartApp.git
```

## Abrindo o Projeto no Android Studio

1. Abra o Android Studio.
2. Selecione "Open an existing Android Studio project".
3. Navegue até o diretório onde você clonou o repositório e selecione a pasta GaugeChartApp.
4. Aguarde o Android Studio configurar o projeto e baixar as dependências necessárias.

## Configurando o Projeto

1. Certifique-se de que o projeto está usando uma versão do Gradle compatível com seu Android Studio.
2. Verifique se todas as dependências no arquivo build.gradle estão resolvidas corretamente.
3. Se necessário, sincronize o projeto com os arquivos Gradle.

## Executando o Aplicativo

1. Conecte um dispositivo Android via USB ou configure um emulador no Android Studio.
2. Selecione o dispositivo ou emulador no menu de dispositivos disponíveis.
3. Clique no ícone "Run" (verde) ou pressione Shift + F10 para compilar e executar o aplicativo no dispositivo/emulador selecionado.

## Funcionalidades

- Gauge de Velocidade: Um medidor de velocidade que muda de cor com base na velocidade atual.
- Botões de Controle: Botões para aumentar e diminuir a velocidade exibida no medidor.

## Estrutura do Projeto

- MainActivity.java: A principal atividade que controla o medidor de velocidade.
- activity_main.xml: Layout da interface do usuário contendo o PointerSpeedometer e os botões.
- arrays.xml: Define as cores usadas pelo medidor de velocidade.

## Personalização

Você pode personalizar as cores e outros atributos do PointerSpeedometer modificando os arquivos XML e os métodos na MainActivity.java.

### Adicionando Novas Cores

1. Abra res/values/arrays.xml.
2. Adicione ou modifique as cores no array gaugeColors.

```bash
<resources>
    <string-array name="gaugeColors">
        <item>#99CC00</item>
        <item>#FFBB33</item>
        <item>#FF4444</item>
    </string-array>
</resources>
```
### Modificando o Layout

1. Abra res/layout/activity_main.xml.
2. Faça as modificações desejadas no layout do medidor ou nos botões.

### Obrigado por usar o GaugeChartApp! Divirta-se codificando!


