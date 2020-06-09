package view;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import controller.BdCliente;
import controller.BdMulta;
import model.Cliente;
import model.Multa;

public class JFMulta extends javax.swing.JFrame {

    public JFMulta() {
        initComponents();

        // Desabilita os campos ao iniciar a janela
        desabilitaCampos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bGDescricao = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jT1IdCliente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jT4ValorTotal = new javax.swing.JTextField();
        jT3Valor = new javax.swing.JTextField();
        jCBDescricao = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jTPesquisar = new javax.swing.JTextField();
        jBPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMulta = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableCliente = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jBExcluir = new javax.swing.JButton();
        jBNovo = new javax.swing.JButton();
        jBSair = new javax.swing.JButton();
        jBRegistrar = new javax.swing.JButton();
        jBPagar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Multas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Multas"));

        jLabel2.setText("ID do cliente: ");

        jLabel3.setText("Descricao");

        jLabel4.setText("Valor: R$");

        jLabel5.setText("Dívida Total do Cliente: R$");

        jCBDescricao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Atraso na devolução", "Livro danificado", "Perda do livro" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jT3Valor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBDescricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT4ValorTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT1IdCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT1IdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT3Valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jT4ValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jT1IdCliente, jT3Valor, jT4ValorTotal});

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar Multas"));

        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jTableMulta.setModel(tmMulta);
        jTableMulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMultaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMulta);

        jLabel6.setText("Nome do cliente: ");

        jTableCliente.setModel(tmCliente);
        jTableCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClienteMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableCliente);

        jLabel8.setText("Selecione a multa abaixo: ");

        jLabel9.setText("Selecione o cliente abaixo: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jTPesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(jBPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(0, 252, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBNovo.setText("Novo");
        jBNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNovoActionPerformed(evt);
            }
        });

        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jBRegistrar.setText("Registrar");
        jBRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistrarActionPerformed(evt);
            }
        });

        jBPagar.setText("Pagar");
        jBPagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBPagarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jBNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBSair, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jBExcluir, jBNovo, jBPagar, jBRegistrar, jBSair});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBPagar)
                    .addComponent(jBExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSair)
                    .addComponent(jBRegistrar)
                    .addComponent(jBNovo))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBExcluir, jBNovo, jBPagar, jBRegistrar, jBSair});

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setText("ATENÇÃO! Para efetuar o pagamento, é necessário ");

        jLabel10.setText("selecionar o campo correspondente ao nome do cliente.");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 15, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel1.getAccessibleContext().setAccessibleName("Cadastro de Clientes");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // BOTÃO NOVO - Precionando
    private void jBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNovoActionPerformed
        limpaCampos();
        limpaTabelaMulta();
        limpaTabelaCliente();
        habilitaCampos();
    }//GEN-LAST:event_jBNovoActionPerformed

    // BOTÃO CADASTRAR - Precionando
    private void jBRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistrarActionPerformed
        cadastraRegistro();
    }//GEN-LAST:event_jBRegistrarActionPerformed

    // BOTÃO PESQUISAR - Precionando
    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        // Ao clicar em pesquisar, é executado o método que efetua a pesquisa, e outro método que exibe a lista da pesquisa
        try {
            listaContatosCliente();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Problemas ao listar contatos.");
        }
    }//GEN-LAST:event_jBPesquisarActionPerformed

    // TABELA MULTA - Selecionando registro com o clique do mouse
    private void jTableMultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMultaMouseClicked

    }//GEN-LAST:event_jTableMultaMouseClicked

    // BOTÃO EXCLUIR - Precionando
    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        try {
            excluirRegistro();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao excluir registro.");
        }
    }//GEN-LAST:event_jBExcluirActionPerformed

    // TABELA CLIENTE - Selecionando registro com o clique do mouse
    private void jTableClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClienteMouseClicked
        // Salva a posição da linha selecionada na tabela de pesquisa
        int linhaSelecionada = jTableCliente.getSelectedRow();

        jT1IdCliente.setText(jTableCliente.getValueAt(linhaSelecionada, 0).toString());

        try {
            listaContatosMulta();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Problemas ao listar multas.");
        }
    }//GEN-LAST:event_jTableClienteMouseClicked

    // BOTÃO PAGAR
    private void jBPagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBPagarMouseClicked
        try {
            pagarMulta();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao pagar a multa.");
        }
    }//GEN-LAST:event_jBPagarMouseClicked

    // FECHANDO A JANELA
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBSairActionPerformed

    /* ----CADASTRO-> */
    // MÉTODOS:
    // Método p/ cadastrar um registro no banco de dados.
    private void cadastraRegistro() {
        // Antes de cadastrar, verifica se os campos foram preenchidos
        if (verificaDados()) {
            try {
                String desc = "Atraso";

                if (jCBDescricao.getSelectedItem().equals("Atraso na devolução")) {
                    desc = "Atraso";
                } else if (jCBDescricao.getSelectedItem().equals("Livro danificado")) {
                    desc = "Estrago";
                } else if (jCBDescricao.getSelectedItem().equals("Perda do livro")) {
                    desc = "Perda";
                }

                Multa m = new Multa();

                m.setId_cliente(Integer.valueOf(jT1IdCliente.getText()));
                m.setDescricao(desc);
                m.setValor(Float.valueOf(jT3Valor.getText()));

                BdMulta d = new BdMulta();

                d.adicionaMulta(m);

                JOptionPane.showMessageDialog(rootPane, "Multa registrada com sucesso.");
                limpaCampos();
                desabilitaCampos();
                listaContatosMulta();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, "Erro ao registrar multa.");
            }

        }
    }

    // Método p/ validação do formulário
    private boolean verificaDados() {
        if ((!jT1IdCliente.getText().equals("")) && (!jT3Valor.getText().equals(""))) {
            return true;
        }
        JOptionPane.showMessageDialog(rootPane, "Dados imcompletos.");
        return false;
    }
    /* <-CADASTRO---- */

 /* ----PESQUISA-> */
    // MÉTODOS:          
    /* ----CLIENTE-> */
    // Configura campos da tabela de pesquisas de acordo com os campos do Cliente
    DefaultTableModel tmCliente = new DefaultTableModel(null, new String[]{"Id", "Nome", "CPF"});
    // Lista de clientes, recebe os registros retornados da pesquisa
    List<Cliente> clientes;

    // Lista a quantidade de resultado, de acordo com o nome passado no campo pesquisa
    private void listaContatosCliente() throws SQLException {
        BdCliente d = new BdCliente();
        clientes = d.getLista("%" + jTPesquisar.getText() + "%");

        // Após pesquisar os contatos, executa o método p/ exibir o resultado na tabela pesquisa
        mostraPesquisaCliente(clientes);
        clientes.clear();
    }

    // Mostra a lista de resultado de acordo com o nome passado no campo pesquisa
    private void mostraPesquisaCliente(List<Cliente> clientes) {
        // Limpa a tabela sempre que for solicitado uma nova pesquisa
        limpaTabelaCliente();

        if (clientes.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Nenhum registro encontrado.");
        } else {
            // Linha em branco usada no for, para cada registro é criada uma nova linha 
            String[] linha = new String[]{null, null, null};
            // P/ cada registro é criada uma nova linha, cada recebe linha os campos do registro
            for (int i = 0; i < clientes.size(); i++) {
                tmCliente.addRow(linha);
                tmCliente.setValueAt(clientes.get(i).getId(), i, 0);
                tmCliente.setValueAt(clientes.get(i).getNome(), i, 1);
                tmCliente.setValueAt(clientes.get(i).getCpf(), i, 2);
            }
        }
    }

    // Limpa a tabela de resultados
    private void limpaTabelaCliente() {
        while (tmCliente.getRowCount() > 0) {
            tmCliente.removeRow(0);
        }
    }
    /*<-CLIENTE----*/

 /*----MULTA->*/
    // Configura campos da tabela de pesquisas de acordo com os campos das Multas
    DefaultTableModel tmMulta = new DefaultTableModel(null, new String[]{"ID Multa", "Nome Cliente", "Descrição", "Valor"});
    // Lista de multas, recebe os registros retornados da pesquisa
    List<Multa> multas;

    // Lista a quantidade de resultado, de acordo com o nome passado no campo pesquisa
    private void listaContatosMulta() throws SQLException {
        BdMulta d = new BdMulta();
        multas = d.getListaMultaPorCliente(pegaIdCliente());

        // Após pesquisar os registros, executa o método p/ exibir o resultado na tabela pesquisa
        mostraPesquisaMulta(multas);
        multas.clear();
    }

    // Mostra a lista de resultado de acordo com o nome passado no campo pesquisa
    private void mostraPesquisaMulta(List<Multa> multas) throws SQLException {
        // Limpa a tabela sempre que for solicitado uma nova pesquisa
        limpaTabelaMulta();

        if (!multas.isEmpty()) {
            // Linha em branco usada no for, para cada registro é criada uma nova linha
            String[] linha = new String[]{null, null, null, null};
            // P/ cada registro é criada uma nova linha, cada linha recebe os campos do registro
            for (int i = 0; i < multas.size(); i++) {
                tmMulta.addRow(linha);
                tmMulta.setValueAt(multas.get(i).getId_multa(), i, 0);
                tmMulta.setValueAt(multas.get(i).getId_cliente(), i, 1);
                tmMulta.setValueAt(multas.get(i).getDescricao(), i, 2);
                tmMulta.setValueAt(multas.get(i).getValor(), i, 3);
            }
            // Valor Multa Total
            // Recebe o valor total das multas
            BdMulta m = new BdMulta();
            String valotTotal = m.totalMultaCliente(pegaIdCliente());
            //Exibe o valor total da soma das multas no campo "Dívida total do cliente: "
            jT4ValorTotal.setText(valotTotal);
        } else {
            jT4ValorTotal.setText(null);
        }
    }

    // Limpa a tabela de resultados
    private void limpaTabelaMulta() {
        while (tmMulta.getRowCount() > 0) {
            tmMulta.removeRow(0);
        }
    }

    /*<-MULTA----*/

    // Pega o ID da multa ao selecioná-la na tabela de pesquisa
    private int pegaIdMulta() {
        int id_multa = 0;

        if (jTableMulta.getSelectedRow() != -1) {
            // Salva a posição da linha selecionada na tabela de pesquisa
            int linhaSelecionada = jTableMulta.getSelectedRow();

            id_multa = (int) jTableMulta.getValueAt(linhaSelecionada, 0);
        }
        return id_multa;
    }

    // Pega o ID do cliente ao selecioná-la na tabela de pesquisa
    private String pegaIdCliente() {
        String id_cliente = "";

        if (jTableCliente.getSelectedRow() != -1) {
            int linhaSelecionadaCliente = jTableCliente.getSelectedRow();
            id_cliente = jTableCliente.getValueAt(linhaSelecionadaCliente, 0).toString();
        }
        return id_cliente;
    }

    /* <-PESQUISA---- */
 /* ----EXCLUIR-> */
    // MÉTODOS:
    // Exclui resgistro
    private void excluirRegistro() throws SQLException {
        // Se algum registro estiver selecionado
        if (jTableMulta.getSelectedRow() != -1) {
            // Exibe uma janela de confirmação antes de exluir o registro
            int resp = JOptionPane.showConfirmDialog(rootPane, "Deseja realmente excluir este registro?",
                    "Confirmação!", JOptionPane.YES_NO_OPTION);

            // Se a confirmação for SIM
            if (resp == JOptionPane.YES_NO_OPTION) {
                // Remove o registro, usando como parâmetro, o id da linha selecionada                
                BdMulta d = new BdMulta();
                d.remove(pegaIdMulta());

                JOptionPane.showMessageDialog(rootPane, "Registro excluido com sucesso.");
                limpaCampos();

                listaContatosMulta();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Multa não selecionada.");
        }
    }

    /* <-EXCLUIR---- */

 /* ----PAGAR-> */
    // MÉTODOS:
    // Exclui resgistro
    private void pagarMulta() throws SQLException {
        // Se algum registro estiver selecionado
        if (jTableCliente.getSelectedRow() != -1) {
            if (!jT4ValorTotal.getText().equals("")) {
                // Exibe uma janela de confirmação antes de exluir o registro
                int resp = JOptionPane.showConfirmDialog(rootPane, "O cliente deseja pagar o valor total da dívida?",
                        "Confirmação!", JOptionPane.YES_NO_OPTION);

                // Se a confirmação for SIM
                if (resp == JOptionPane.YES_NO_OPTION) {
                    // Remove o registro, usando como parâmetro, o id da linha selecionada                
                    BdMulta d = new BdMulta();
                    d.removeMultas(pegaIdCliente());

                    JOptionPane.showMessageDialog(rootPane, "Pendência sanada com sucesso.");
                    limpaCampos();

                    listaContatosMulta();
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Este cliente não possui multas.");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Cliente não selecionado.");
        }
    }

    /* <-PAGAR---- */

 /* ----OUTROS-> */
    // MÉTODOS:
    // Limpa os campos do formulário
    private void limpaCampos() {
        jT1IdCliente.setText("");
        jT3Valor.setText("");
        jT4ValorTotal.setText("");
    }

    // Desabilita os campos do formulário
    private void desabilitaCampos() {
        jT1IdCliente.setEditable(false);
        jT4ValorTotal.setEditable(false);
    }

    // Desabilita os campos do formulário
    private void habilitaCampos() {
        jT1IdCliente.setEditable(true);
    }

    // Recebendo valores da janela de emprestimos
    public void recebe(String valor, String id) {
        jT3Valor.setText(valor);
        jT1IdCliente.setText(id);
    }

    /* <-OUTROS---- */
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFMulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFMulta().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bGDescricao;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBNovo;
    private javax.swing.JButton jBPagar;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBRegistrar;
    private javax.swing.JButton jBSair;
    private javax.swing.JComboBox jCBDescricao;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jT1IdCliente;
    private javax.swing.JTextField jT3Valor;
    private javax.swing.JTextField jT4ValorTotal;
    private javax.swing.JTextField jTPesquisar;
    private javax.swing.JTable jTableCliente;
    private javax.swing.JTable jTableMulta;
    // End of variables declaration//GEN-END:variables

}
