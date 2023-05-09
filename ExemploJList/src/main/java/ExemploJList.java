import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExemploJList extends JFrame {
    JList lista;
    //A maneira mais usual de criar um caixa de listagem em Java é usar um vetor de Strings para definirmos os itens que serão exibidos na lista
    String cidades[] = {"Rio de Janeiro", "São Paulo", "Minas Gerais", "Espírito Santo", "Bahia", "Pernambuco", "Rio Grande do Sul", "Acre"};
    JLabel rotulo;
    JButton exibir;
  
    public ExemploJList(){
        super("Exemplo de Lista");
        Container tela = getContentPane();
        setLayout(null);
        exibir = new JButton("Exibir");
        rotulo = new JLabel("");
        lista = new JList(cidades);
        //quantidade de elementos que serão visíveis sem a necessidade de acionar as barras de rolagem isso é feito na linha:
        lista.setVisibleRowCount(5);
        JScrollPane painelRolagem = new JScrollPane(lista);
        //seleciona um item por vez
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        painelRolagem.setBounds(40, 50, 150, 100);
        exibir.setBounds(270, 50, 100,30);
        rotulo.setBounds(50,150,200,30);
        //evento do botão 
        exibir.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        rotulo.setText("O estado é: " +lista.getSelectedValue());
                                
                    }
                }
        );
            tela.add(painelRolagem);
            tela.add(exibir);
            tela.add(rotulo);
            setVisible(true);
    }
    public static void main(String args[]){
        ExemploJList app = new ExemploJList();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
