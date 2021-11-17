# Actor: Maria

@stories
Feature: Generate a pdf

  @scenario1
  Scenario: Generate a pdf from the Bancolombia page

    Given Maria enter the Bancolombia page
    When select the Inversiones option for Monto mínimo de $500.000 about the Conoce Mas option
    And select the Documentos option download the PDF Reglamento de Inversion Virtual Bancolombia
    Then the document is generate
