/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo09;

/**
 *
 * @author ficdev
 */
/**
 * Classe para objetos do tipo Funcionários, onde serão contido
 *
 * @author Manoel Pimentel
 * @version 1.05
 * @since Release 02 da aplicação
 */
public class Funcionarios {

    private String matricula;
    private Double salario;

    public String getMatricula() {
        return this.matricula;
    }

    /**
     * Método para retorno do salário do funcionário
     *
     * @return Double - Valor do Salário
     */
    public Double getSalario() {
        return this.salario;
    }

    /**
     * Método para calculo da diária com base no salário do funcionário dividido
     * pelo mês comercial de 30 dias para efei
     *
     * @author Emanuel Silva
     * @param diasViagem int - Valor total das vendas do mês.
     * @param valorDeslocamento Double - Valor pago em cada diária
     * @return Double - Valor da diaria
     */
    public Double calculoAjudaCusto(int diasViagem, Double valorDeslocamento) {
        try {
            return (this.salario / 30) * diasViagem + valorDeslocamento;
        } catch (ArithmeticException ae) {
            return 0.0;
        }
    }

    /**
     * Método para calculo do valor da bonificação baseada na seguinte faixa de
     * valores: Para vendas menores de 25.000,00, o percentual de comissão
     * aplicado será de 5%, e * será de 10%
     *
     * @author Manoel Pimentel
     * @param valorVendas - Valor total das vendas do mês
     * @return Double - Valor do resultado do cálculo conforme a fa
     */

    public Double calculaBonificacao(Double valorVendas) {
        if (valorVendas < 25000.00) {
            return this.salario * 0.05;
        } else {
            return this.salario * 0.10;
        }
    }

}
