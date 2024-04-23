/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package telajtextfield;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Karinne Angelo dos Santos Ventura
 */
public class TelaJTextField extends JFrame{
    
    /* CRIAÇÃO DE VARIÁVEIS DE INSTANCIA */
    // JLABEL - USADO PARA CRIAR ESPAÇO DE JANELA
    JLabel rotulo1, rotulo2, rotulo3, rotulo4;
   
    // JTEXTFIELD - CAIXA DE TEXTO
    JTextField texto1, texto2, texto3, texto4;
    
    // CRIAÇÃO DO MÉTODO CONSTRUTOR
    public TelaJTextField(){
         
        // TITULO DA PÁGINA
        super("Exemplo com JTextField");
        
        // CRIAÇÃO DO CONTAINER PARA RECEBER OBJETOS
        Container tela = getContentPane();
        
        // SERVE PARA AUTORIZAR O USO DO setBounds E DOS OBJETOS - PRECISA ESTAR NULL
        setLayout(null);
        
        /* CRIAÇÃO DOS OBJETOS */
        // JLabel's e JTextField's
        // VARIÁVEL = NOVO OBJETO JLABEL ("NOME DO CAMPO")
        rotulo1 = new JLabel ("Nome:");
        rotulo2 = new JLabel ("Idade:");
        rotulo3 = new JLabel ("Telefone:");
        rotulo4 = new JLabel ("Celular:");
        
        // VARIÁVEL = NOVO OBJETO JTextField (QUANTIDADE DE CARACTERES QUE SUPORTA)
        texto1 = new JTextField (50);
        texto2 = new JTextField (3);
        texto3 = new JTextField (10);
        texto4 = new JTextField (10);
        
        // UTILIZAÇÃO DOS OBJETOS
        // setBounds SERVE PARA DEFINIR O LOCAL DE CADA ELEMENTO, (X,Y) - (LINHA,COLUNA)
        rotulo1.setBounds(50,20,80,20);
        rotulo2.setBounds(50,60,80,20);
        rotulo3.setBounds(50,100,80,20);
        rotulo4.setBounds(50,140,80,20);
        texto1.setBounds(110,20,200,20);
        texto2.setBounds(110,60,20,20);
        texto3.setBounds(110,100,80,20);
        texto4.setBounds(110,140,80,20);
        
        
        //COM O O OBJETO "TELA" CRIADO NO CONTAINER, ADICIONAMOS OS OBJETOS NA TELA
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        setSize(400,250);
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
