import javax.swing.JOptionPane;

public class LimiteCredito2 {
	
public static void main (String args[]){
	
int conta, saldoInicial, itensComprados,
creditosIns, limiteCredito, saldoNovo;
String sConta, sSaldoInicial, sItensComprados,
sCreditosIns, sLimiteCredito;
sConta = JOptionPane.showInputDialog (
"Digite o n�mero da conta ou -1 para sair: ");
conta = Integer.parseInt(sConta);
while (conta != -1){
sSaldoInicial = JOptionPane.showInputDialog (
"Digite o saldo inicial do cliente: ");
saldoInicial = Integer.parseInt(sSaldoInicial);
sItensComprados = JOptionPane.showInputDialog (
"Digite o total comprado a cr�dito: ");
itensComprados = Integer.parseInt(sItensComprados);
sCreditosIns = JOptionPane.showInputDialog (
"Digite o total de cr�ditos do m�s: ");
creditosIns = Integer.parseInt(sCreditosIns);
sLimiteCredito = JOptionPane.showInputDialog (
"Digite o limite de cr�dito autorizado: ");
limiteCredito = Integer.parseInt(sLimiteCredito);
saldoNovo = saldoInicial + itensComprados - creditosIns;
if (saldoNovo > limiteCredito)
JOptionPane.showMessageDialog(null,
"Limite de cr�dito excedido",
"Aprova��o de cr�dito",
JOptionPane.INFORMATION_MESSAGE);
else
JOptionPane.showMessageDialog(null,
"Limite aprovado",
"Aprova��o de cr�dito",
JOptionPane.INFORMATION_MESSAGE);
sConta = JOptionPane.showInputDialog (
"Digite o n�mero da conta ou -1 para sair: ");
conta = Integer.parseInt(sConta);
}
}
}