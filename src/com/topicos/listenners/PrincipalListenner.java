/*
Criado por Gabriel Gageiro;
Data:04/04/18
*/


package com.topicos.listenners;

import com.topicos.telas.frames.Principal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.sun.deploy.uitoolkit.ToolkitStore.dispose;

public class PrincipalListenner implements ActionListener{


    private String sobreItem(){
        return "<html>"+"<h2>Trabalho de Topicos Especiais I.</h2>"+
                "<p>ERP para bibliotecas</p>"+"Desenvolvido por Erick, Gabriel, Marcelo"+"</html>";
    }

    public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null,sobreItem(),"Sobre",JOptionPane.INFORMATION_MESSAGE);
        
    }
/*
    private JMenuBar menuBar;

    private JMenu ArquivoMenu ;

    private JMenuItem SairArquivoItem;

    private JMenu AdminMenu;

    private JMenuItem AdicionarUsuarioItem;

    private JMenuItem RemoverUsuarioItem;

    private JMenu AjudaMenu;


    private JMenuItem SobreItem;

    public PrincipalListenner(JMenuBar menuBar,JMenu ArquivoMenu ,JMenuItem SairArquivoItem,
             JMenu AdminMenu,JMenuItem AdicionarUsuarioItem,JMenuItem RemoverUsuarioItem,
             JMenu AjudaMenu,JMenuItem SobreItem){

        this.AdicionarUsuarioItem=AdicionarUsuarioItem;
        this.menuBar=menuBar;
        this.ArquivoMenu=ArquivoMenu;
        this.SairArquivoItem=SairArquivoItem;
        this.AdminMenu=AdminMenu;
        this.RemoverUsuarioItem=RemoverUsuarioItem;
        this.AjudaMenu=AjudaMenu;
        this.SobreItem=SobreItem;
    }*/

}