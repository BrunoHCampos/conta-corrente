package corrente;
import java.util.Scanner;
public class Dados {
String numero="123456";
String agencia = "246";
double saldo= -10;
boolean especial= true;
double saldoCheque =500;
double saque;
double deposito;
int utilizarCheque;
double disponivelsaque;
int opcao;
boolean depositar;
boolean saldoInsuficiente;
int opcao2;
				Scanner cs = new Scanner(System.in);
				Scanner scan = new Scanner(System.in);
				
				
			void menu()	{
				System.out.println("Digite (1) se deseja sacar");
					System.out.println("Digite (2) se deseja depositar");
						System.out.println("Digite (3) se deseja vizualizar saldo");
							opcao=scan.nextInt();
			
			switch(opcao) {
				case 1: System.out.println("Digite o valor que deseja sacar");
					saque=scan.nextDouble();
						break;
			
			case 2:System.out.println("Digite o valor que você deseja depositar");
				depositar=true;
				deposito=scan.nextDouble();
					break;
			
			case 3:System.out.println("seu saldo é " +saldo);
			break;
			case 4:System.out.println(" operação finalizada ");
			break;
			default: System.out.println(" opção inválida ");
			break;
			}
				
			}			
				 void RealizarSaque(double saque) {
					 if(opcao==1) {
					 if(saldo>=saque) {
						saldo-=saque;
							System.out.println("Saque realizado com sucesso");
					 }
					
					 if(saldo<saque) {
					
						System.out.println("Saldo insuficiente ");
					}
					
					 }
				 }

				void DisponibilidadeSaque () {
					
					
					disponivelsaque=saldoCheque+=saldo;
					
		
					if(saque>0&&saldo<saque&& especial && disponivelsaque>=saque) {
						System.out.println(" saldo disponivel para saque com utilização de cheque especial "+disponivelsaque);
							System.out.println("Deseja utilizar cheque especial disponível");
							System.out.println("Se sim digite (1) se não digite qualquer tecla");
								opcao2=cs.nextInt();
					
					if(opcao2==1) {
						System.out.println("saque realizado com sucesso ");	
							disponivelsaque-=saque;
								saldo-=saque;
									System.out.println("saldo de cheque especial disponível "+disponivelsaque);
					}else {
						System.out.println("operação finalizada");
				}
}
				}
				
				void ApresentarSaldo() {
					System.out.println("seu saldo é "+saldo);
					
				}
				void depositar(double deposito) {
					if(depositar) {
						saldo+=deposito;
							System.out.println("saldo disponível "+saldo);
					}
	
				}
					

					
}