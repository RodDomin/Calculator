package Base;

/*PATCH 0.2.5
 * -Agora foi adicionado o botao +/- para trocar o sinal do numero.
 */


//Swing
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

//AWT
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Toolkit;


public class Calculator extends JFrame implements ActionListener{

	//Variaveis para o funcionamento do prog
	int NumOPE;
	float NumInic = 0;
	float NumFin = 0;
	float Res;
	boolean teste = false;
	boolean virgInic = false;
	boolean	virgFin = false;
	float elevInic = 0;
	float elevFin = 0;
	public String OPE;
	
	JTextField valoresT = new JTextField();

	public Calculator(){

		editarJanela();
	}


	public void editarJanela() {
		
		/*
		 * -O método editarJanela basicamente fica responsalvel por adicionar todos os botoões do app
		 *  controlar as caracteristicas de capa botão e da janela. 
		 * 
		*/
		
		JButton mais = new JButton("+");
		mais.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if(teste == false) {
				teste = true;
				NumOPE = 1;
				OPE = " + ";
			
				}
				else {
					if(NumOPE == 1) {
						
						Res = NumInic + NumFin;
					
					}
					if(NumOPE == 2) {
						
						Res = NumInic - NumFin;
						
					}
					if(NumOPE == 3) {
						
						Res = NumInic * NumFin;
					
					}
					if(NumOPE == 4) {
						
						Res = NumInic / NumFin;
						
					}
					
					NumInic = Res;
					NumFin = 0;
					elevFin = 0;
					OPE = " + ";
					NumOPE = 1;
					valoresT.setText("" + NumInic + OPE + NumFin);
					
				}
			}
		});
		JButton menos = new JButton("-");
		menos.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if(teste == false) {
				teste = true;
				NumOPE = 2;
				OPE = " - ";
				}
				else {
					if(NumOPE == 1) {
						
						Res = NumInic + NumFin;
					
					}
					if(NumOPE == 2) {
						
						Res = NumInic - NumFin;
						
					}
					if(NumOPE == 3) {
						
						Res = NumInic * NumFin;
					
					}
					if(NumOPE == 4) {
						
						Res = NumInic / NumFin;
						
					}
					
					NumInic = Res;
					NumFin = 0;
					elevFin = 0;
					OPE = " - ";
					NumOPE = 2;
					valoresT.setText("" + NumInic + OPE + NumFin);

				}
				

			}
		});
		JButton multi = new JButton("*");
		multi.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if(teste == false) {
				teste = true;
				NumOPE = 3;
				OPE = " x ";
				}
				else {
					if(NumOPE == 1) {
						
						Res = NumInic + NumFin;
					
					}
					if(NumOPE == 2) {
						
						Res = NumInic - NumFin;
						
					}
					if(NumOPE == 3) {
						
						Res = NumInic * NumFin;
					
					}
					if(NumOPE == 4) {
						
						Res = NumInic / NumFin;
						
					}
					
					NumInic = Res;
					NumFin = 0;
					elevFin = 0;
					OPE = " x ";
					NumOPE = 3;
					valoresT.setText("" + NumInic + OPE + NumFin);

					
					
				}
			}
		});

		JButton divi = new JButton("/");
		divi.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if(teste == false) {
				teste = true;
				NumOPE = 4;
				OPE = " / ";
				}
				else {
					if(NumOPE == 1) {
						
						Res = NumInic + NumFin;
					
					}
					if(NumOPE == 2) {
						
						Res = NumInic - NumFin;
						
					}
					if(NumOPE == 3) {
						
						Res = NumInic * NumFin;
					
					}
					if(NumOPE == 4) {
						
						Res = NumInic / NumFin;
						
					}
					
					NumInic = Res;
					NumFin = 0;
					elevFin = 0;
					OPE = " / ";
					NumOPE = 4;
					valoresT.setText("" + NumInic + OPE + NumFin);

				}
			}
		});
		
		JButton virgula = new JButton(",");
		virgula.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(teste == false) {
				
				virgInic = true;
				}
				
				else {
					
				virgFin = true;	
				}
				
			}
			
		});

		JButton maisomen = new JButton("+/-");
		maisomen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(teste == false) {
					NumInic = NumInic * (-1);
				}
				else {
					NumFin = NumFin * (-1);
				}
			}
			
		});
		
		JButton Igual = new JButton("=");
		Igual.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if(NumOPE == 1) {
					
					Res = NumInic + NumFin;
				
				}
				if(NumOPE == 2) {
					
					Res = NumInic - NumFin;
					
				}
				if(NumOPE == 3) {
					
					Res = NumInic * NumFin;
				
				}
				if(NumOPE == 4) {
					
					Res = NumInic / NumFin;
					
				}
				
				
				valoresT.setText("" + NumInic + OPE + NumFin  + " = " + Res);
			
				
			}
			
			
		});

		JButton clear = new JButton("C");
		clear.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				NumInic = 0;
				NumFin = 0;
				elevInic = 0;
				elevFin = 0;
				virgInic = false;
				virgFin = false;
				teste = false;				
				valoresT.setText(" " + NumInic);
			}
		});

		JButton clear1 = new JButton("CE");
		clear1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(teste == false) {
					virgInic = false;
					elevInic = 0;
					NumInic = 0;
					valoresT.setText("" + NumInic);
					
				}
				else {
					virgFin = false;
					elevFin = 0;
					NumFin = 0;
					valoresT.setText("" + NumInic + OPE + "" + NumFin);
				}
			}
			
		});
			

		JButton jb0 = new JButton("0");
		jb0.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (teste == false) {
					if(virgInic == false) {
					
					NumInic = 0 + (NumInic * 10);
					valoresT.setText(" " + NumInic);
					}
					else {
					elevInic++;	
					NumInic = (float) (0 * ((float) 1 / Math.pow(10, elevInic))) + NumInic;
					valoresT.setText(" "+ NumInic);
					
					}
				}
				else {
					if(virgFin == false) {
					NumFin = 0 + (NumFin * 10);
					valoresT.setText(" " + NumInic + OPE + "" + NumFin);
					
					}
					else {
					elevFin++;	
					NumFin = (float) (0 *((float) 1 / Math.pow(10, elevFin))) + NumFin;
					valoresT.setText("" + NumInic+ OPE + "" + NumFin);
					
					}
				}
			}
		});

		JButton jb1 = new JButton("1");
		jb1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (teste == false) {
					if(virgInic == false) {
					
					NumInic = 1 + (NumInic * 10);
					valoresT.setText("" + NumInic);
					}
					else {
					elevInic++;	
					NumInic = (float) (1 * ((float) 1 / Math.pow(10, elevInic))) + NumInic;
					valoresT.setText(""+ NumInic);
					
					}
				}
				else {
					if(virgFin == false) {
					NumFin = 1 + (NumFin * 10);
					valoresT.setText("" + NumInic+ OPE + "" + NumFin);
					
					}
					else {
					elevFin++;	
					NumFin = (float) (1 *((float) 1 / Math.pow(10, elevFin))) + NumFin;	
					valoresT.setText("" + NumInic+ OPE + "" + NumFin);
					
					}
				}

			}
		});


		JButton jb2 = new JButton("2");
		jb2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (teste == false) {
					if(virgInic == false) {
					
					NumInic = 2 + (NumInic * 10);
					valoresT.setText("" + NumInic);
				
					}
					else {
					elevInic++;	
					NumInic = (float) (2 * ((float) 1 / Math.pow(10, elevInic))) + NumInic;	
					valoresT.setText("" + NumInic);
					}
				}	
				else {
					if(virgFin == false) {
					
					NumFin = 2 + (NumFin * 10);
					valoresT.setText("" + NumInic + OPE + "" + NumFin);
					}
					else {
					elevFin++;
					NumFin = (float) (2 * ((float) 1 / Math.pow(10, elevFin))) + NumFin;
					valoresT.setText("" + NumInic+ OPE + "" + NumFin);
						
					}
				}
			}
		});


		JButton jb3 = new JButton("3");
		jb3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (teste == false) {
					if(virgInic == false) {
					NumInic = 3 + (NumInic * 10);
					valoresT.setText("" + NumInic);
					
					}
					else {
					elevInic++;	
					NumInic = (float) (3 * ((float) 1 / Math.pow(10, elevInic))) + NumInic;
					valoresT.setText("" + NumInic);
					
					}
				}
				else {
					if(virgFin == false) {
					NumFin = 3 + (NumFin * 10);
					valoresT.setText("" + NumInic+ OPE + "" + NumFin);
					
					}
					else {
					elevFin++;
					NumFin = (float) (3 * ((float) 1 / Math.pow(10, elevFin))) + NumFin;
					valoresT.setText("" + NumInic+ OPE + "" + NumFin);
						
					}
				}

			}
		});


		JButton jb4 = new JButton("4");
		jb4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (teste == false) {
					if(virgInic == false) {				
					NumInic = 4 + (NumInic * 10);
					valoresT.setText("" + NumInic);
				
					}
					else {
					elevInic++;
					NumInic = (float) (4 * ((float) 1 / Math.pow(10, elevInic))) + NumInic;
					valoresT.setText("" + NumInic);
					
					}
				}
				else {
					if(virgFin == false) {
					NumFin = 4 + (NumFin * 10);
					valoresT.setText("" + NumInic+ OPE + "" + NumFin);
					
					}
					else {
					elevFin++;
					NumFin = (float) (4 * ((float) 1 / Math.pow(10, elevFin))) + NumFin;
					valoresT.setText("" + NumInic+ OPE + "" + NumFin);
					
					}
				}
				
			}
			
		});


		JButton jb5 = new JButton("5");
		jb5.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (teste == false) {
					if(virgInic == false) {				
					NumInic = 5 + (NumInic * 10);
					valoresT.setText("" + NumInic);
				
					}
					else {
					elevInic++;
					NumInic = (float) (5 * ((float) 1 / Math.pow(10, elevInic))) + NumInic;
					valoresT.setText("" + NumInic);
					
					}
				}
				else {
					if(virgFin == false) {
					NumFin = 5 + (NumFin * 10);
					valoresT.setText("" + NumInic+ OPE + "" + NumFin);
					
					}
					else {
					elevFin++;
					NumFin = (float) (5 * ((float) 1 / Math.pow(10, elevFin))) + NumFin;
					valoresT.setText("" + NumInic+ OPE + "" + NumFin);
					
					}
				}


			}
		});


		JButton jb6 = new JButton("6");
		jb6.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (teste == false) {
					if(virgInic == false) {				
					NumInic = 6 + (NumInic * 10);
					valoresT.setText("" + NumInic);
					
					}
					else {
					elevInic++;
					NumInic = (float) (6 * ((float) 1/ Math.pow(10, elevInic))) + NumInic;
					valoresT.setText("" + NumInic);
					
					}
				}
				else {
					if(virgFin == false) {
					NumFin = 6 + (NumFin * 10);
					valoresT.setText("" + NumInic+ OPE + "" + NumFin);
				
					}
					else {
					elevFin++;
					NumFin = (float) (6 * ((float) 1 / Math.pow(10, elevFin))) + NumFin;
					valoresT.setText("" + NumInic+ OPE + "" + NumFin);
						
					}			
				}
			}	
		});


		JButton jb7 = new JButton("7");
		jb7.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (teste == false) {
					if(virgInic == false) {				
					NumInic = 7 + (NumInic * 10);
					valoresT.setText("" + NumInic);
					
					}
					else {
					elevInic++;
					NumInic = (float) (7 * ((float) 1/ Math.pow(10, elevInic))) + NumInic;
					valoresT.setText("" + NumInic);
					
					}
				}
				else {
					if(virgFin == false) {
					NumFin = 7 + (NumFin * 10);
					valoresT.setText("" + NumInic+ OPE + "" + NumFin);
				
					}
					else {
					elevFin++;
					NumFin = (float) (7 * ((float) 1 / Math.pow(10, elevFin))) + NumFin;
					valoresT.setText("" + NumInic+ OPE + "" + NumFin);
						
					}			
				}

			}
		});


		JButton jb8 = new JButton("8");
		jb8.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (teste == false) {
					if(virgInic == false) {				
					NumInic = 8 + (NumInic * 10);
					valoresT.setText("" + NumInic);
					
					}
					else {
					elevInic++;
					NumInic = (float) (8 * ((float) 1/ Math.pow(10, elevInic))) + NumInic;
					valoresT.setText("" + NumInic);
					
					}
				}
				else {
					if(virgFin == false) {
					NumFin = 8 + (NumFin * 10);
					valoresT.setText("" + NumInic+ OPE + "" + NumFin);
				
					}
					else {
					elevFin++;
					NumFin = (float) (8 * ((float) 1 / Math.pow(10, elevFin))) + NumFin;
					valoresT.setText("" + NumInic+ OPE + "" + NumFin);
						
					}			
				}

			}
		});


		JButton jb9 = new JButton("9");
		jb9.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				if (teste == false) {
					if(virgInic == false) {				
					NumInic = 9 + (NumInic * 10);
					valoresT.setText("" + NumInic);
					
					}
					else {
					elevInic++;
					NumInic = (float) (9 * ((float) 1/ Math.pow(10, elevInic))) + NumInic;
					valoresT.setText("" + NumInic);
					
					}
				}
				else {
					if(virgFin == false) {
					NumFin = 9 + (NumFin * 10);
					valoresT.setText("" + NumInic+ OPE + "" + NumFin);
				
					}
					else {
					elevFin++;
					NumFin = (float) (9 * ((float) 1 / Math.pow(10, elevFin))) + NumFin;
					valoresT.setText("" + NumInic+ OPE + "" + NumFin);
						
					}			
				}


			}
		});




		setLayout(null);
		jb0.setBounds(25, 350, 110, 50);
		add(jb0);

		jb8.setBounds(85, 290, 50, 50);
		add(jb8);

		jb9.setBounds(145, 290, 50, 50);
		add(jb9);

		jb7.setBounds(25, 290, 50, 50);
		add(jb7);

		jb6.setBounds(145, 230, 50, 50);
		add(jb6);

		jb5.setBounds(85, 230, 50, 50);
		add(jb5);

		jb4.setBounds(25, 230, 50, 50);
		add(jb4);

		jb3.setBounds(145, 170, 50, 50);
		add(jb3);

		jb2.setBounds(85, 170, 50, 50);
		add(jb2);

		jb1.setBounds(25, 170, 50, 50);
		add(jb1);

		mais.setBounds(215, 170, 50, 50);
		add(mais);

		menos.setBounds(215, 230, 50, 50);
		add(menos);

		multi.setBounds(215, 290, 50, 50);
		add(multi);

		divi.setBounds(215, 350, 50, 50);
		add(divi);

		Igual.setBounds(145, 350, 50, 50);
		add(Igual);

		clear.setBounds(25, 115, 50, 50);
		add(clear);
		
		virgula.setBounds(145, 115, 50 ,50);
		add(virgula);
		
		clear1.setBounds(82, 115, 55 ,50);
		add(clear1);
		
		maisomen.setBounds(210, 115, 60, 50);
		add(maisomen);
		

		add(valoresT);
		valoresT.setText("" + NumInic);
		valoresT.setBounds(25, 10, 250, 100);
		valoresT.setEditable(false);



		setTitle("Calculadora(0.2.5)");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Calculator.class.getResource("/Base/icon.png")));
		setSize(300, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);


	}
	
		




	public static void main(String [] args) {
		new Calculator();
		
		
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		

	}

}