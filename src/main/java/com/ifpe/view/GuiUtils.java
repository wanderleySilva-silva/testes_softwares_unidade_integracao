/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ifpe.view;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Aluno
 */
public class GuiUtils {
    ImageIcon icon32 = new ImageIcon(getClass().getResource("images/icon32.png"));
    
    public static void mostraMsgSucesso() {
         JOptionPane.showMessageDialog(null, "Opera��o realizada com sucesso!", "IFEmpr�stimo", JOptionPane.INFORMATION_MESSAGE,
                        new ImageIcon("images/icon32.png"));
    }
    
    public static void mostraMsgFalhaSiapeIgual() {
         JOptionPane.showMessageDialog(null, "A opera��o falhou. Verifique se os campos est�o "
                        + "corretos ou se j� n�o existe um SIAPE com esse n�mero.", "IFEmpr�stimo", JOptionPane.ERROR_MESSAGE);
    }
    
    public static void mostraMsgFalhaCodigoIgual() {
         JOptionPane.showMessageDialog(null, "A opera��o falhou. Verifique se os campos est�o "
                        + "corretos ou se j� n�o existe um item com esse código.", "IFEmpr�stimo", JOptionPane.ERROR_MESSAGE);
    }
     
    public static void mostraMsgFalhaAoRemoverProfessor() {
          JOptionPane.showMessageDialog(null, "A opera��oo falhou. Verifique se o SIAPE est� correto ou se n�o existe um "
                        + "empr�stimo associado a este professor.", "IFEmpr�stimo", JOptionPane.ERROR_MESSAGE);
    }
    
    public static void mostraMsgFalhaAoRemoverItem() {
         JOptionPane.showMessageDialog(null, "A opera��o falhou. Verifique se o c�digo est� correto ou se n�o existe um "
                        + "empr�stimo associado a este item.", "IFEmpr�stimo", JOptionPane.ERROR_MESSAGE);
    }
    
    public static String recebeSiapeParaRemoverProfessor() {
        return (String)JOptionPane.showInputDialog(null, "Siape do professor: ", "IFEmpr�stimo", JOptionPane.QUESTION_MESSAGE,
                    new ImageIcon("images/icon32.png"), null, null);
    }
    
    public static String recebeCodigoParaRemoverItem() {
        return (String)JOptionPane.showInputDialog(null, "C�digo do item: ", "IFEmpr�stimo", JOptionPane.QUESTION_MESSAGE,
                    new ImageIcon("images/icon32.png"), null, null);
    }
    
    public static int mostraTabelaProfessor(JTable professores) {
        return JOptionPane.showConfirmDialog(null, new JScrollPane(professores), "IFEmpr�stimo", JOptionPane.INFORMATION_MESSAGE,
                        JOptionPane.QUESTION_MESSAGE, new ImageIcon("images/icon32.png"));
    }
    
    public static int mostraTabelaItem(JTable itens) {
        return JOptionPane.showConfirmDialog(null, new JScrollPane(itens), "IFEmpr�stimo", JOptionPane.INFORMATION_MESSAGE,
                            JOptionPane.QUESTION_MESSAGE, new ImageIcon("images/icon32.png"));
    }
    
    public static int mostraTabelaEmprestimo(JTable emprestimos) {
        return JOptionPane.showConfirmDialog(null, new JScrollPane(emprestimos), "IFEmpr�stimo", JOptionPane.INFORMATION_MESSAGE,
                        JOptionPane.QUESTION_MESSAGE, new ImageIcon("images/icon32.png"));
    }
    public static int mostraConfirmacaoEmprestimo(String siapeProf, String codItem) {
        return JOptionPane.showConfirmDialog(null, "Empr�stimo para o siape "+siapeProf+" do item "
                                + "com c�digo "+codItem, "IFEmpr�stimo", JOptionPane.INFORMATION_MESSAGE, JOptionPane.QUESTION_MESSAGE, new ImageIcon("images/icon32.png"));
    }
    
    
    public static int mostraConfirmacaoRemoverEmprestimo(int codEmp) {
        return JOptionPane.showConfirmDialog(null, "Encerrar empr�stimo com o c�digo "+codEmp, "IFEmpr�stimo", JOptionPane.INFORMATION_MESSAGE, JOptionPane.QUESTION_MESSAGE, new ImageIcon("images/icon32.png"));
    }
    
    public static void mostraMsgTodosItensEmprestados() {
         JOptionPane.showMessageDialog(null, "N�o h� mais itens dispon�veis para empr�stimo.", "IFEmpr�stimo", JOptionPane.ERROR_MESSAGE);
    }
    
    
    public static void mostraMsgTelefoneInvalido() {
         JOptionPane.showMessageDialog(null, "O telefone digitado n�o � v�lido.", "IFEmpr�stimo", JOptionPane.ERROR_MESSAGE);
    }
    
    public static void mostraMsgSiapeInvalido() {
         JOptionPane.showMessageDialog(null, "O siape digitado n�o � v�liddo.", "IFEmpr�stimo", JOptionPane.ERROR_MESSAGE);
    }
    
}
