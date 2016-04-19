package br.com.cabal.automatico.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;

/**
 * @author LeandroG
 * Criado em 18/04/2016
 *
 */
public class TelaPrincipal extends JFrame implements Runnable {
	private static final long serialVersionUID = -6560391753659130998L;
	
	private JPanel contentPane;  
    private JProgressBar progressBar = new JProgressBar();
    
    private static final int M_ALTURA  = 200;
    private static final int M_LARGURA = 500;
    int i;

	/** 
     * Create the frame. 
     */  
    public TelaPrincipal() {  
        setTitle("Carregando...");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setBounds(100, 100, 342, 130);
        setSize(M_LARGURA, M_ALTURA);
        contentPane = new JPanel();  
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));  
        setContentPane(contentPane);  
        setLocationRelativeTo(null); // Centraliza a tela  
        contentPane.setLayout(null);  
        progressBar.setBounds(103, 55, 213, 19);  
          
        progressBar.setValue(0);  
        contentPane.add(progressBar);  
          
        new Thread(this).start();  
    }
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        EventQueue.invokeLater(new Runnable() {  
            public void run() {  
                try {  
                	TelaPrincipal frame = new TelaPrincipal();  
                    frame.setVisible(true);  
                } catch (Exception e) {  
                    e.printStackTrace();  
                }  
            }  
        });
	}
    
	public void run() {  
        try {  
            System.out.println("inicio");//<img src="http://javafree.uol.com.br/forum/images/smiles/icon_wink.gif">;  
            while (i < 101) {  
                Thread.sleep(35); //35  
                progressBar.setValue(i++);  
                //System.out.println("i: " + i);  
            }  
              
            //Tela_Principal frame = new Tela_Principal(); // Adiciona "Outros_Sobre" ao FRAME  
            //frame.setVisible(true); // Torna-o visivel este FRAME  
            //setVisible(false); // Torna-o invisivel este FRAME  
              
// aqui voce pode inserir outra tela e fechar o loadscreen  
              
        } catch (InterruptedException e) {  
            e.printStackTrace();  
        }  
    }
}
