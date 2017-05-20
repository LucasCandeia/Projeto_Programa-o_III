/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serv;

import Repositorio.RepositorioM;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import negocio.Mulher;

/**
 *
 * @author EAD
 */
@WebServlet(name = "ServM", urlPatterns = {"/ServM"})
public class ServM extends HttpServlet {

    private Repositorio.IRepositorio repositorioMulher = new RepositorioM();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String nome = request.getParameter("nome");
        Integer idade = Integer.parseInt(request.getParameter("idade"));
        String tipo = request.getParameter("tipo");
        String dataUltimaMes = arrumaData(request.getParameter("data"));
        String dataProximaMes = "";

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataUltimaMesDate = null;
        try {
            dataUltimaMesDate = formato.parse(dataUltimaMes);
        } catch (ParseException ex) {
            Logger.getLogger(ServM.class.getName()).log(Level.SEVERE, null, ex);
        }
        Calendar calen = Calendar.getInstance();
        calen.setTime(dataUltimaMesDate);
        calen.add(Calendar.DAY_OF_MONTH, 28);
        Date dataFinal = calen.getTime();
        dataProximaMes = formato.format(dataFinal);

        Mulher nova = new Mulher(nome, idade, tipo, dataUltimaMes, dataProximaMes);
        this.repositorioMulher.cadastrar(nova);

        HttpSession session = request.getSession();
        session.setAttribute("lista", this.repositorioMulher.listar());

        request.getRequestDispatcher("indexJsp.jsp").forward(request, response);

    }

    private String arrumaData(String data) {
        char[] dataQuebrada = data.toCharArray();

        String ano = dataQuebrada[0] + "" + dataQuebrada[1] + "" + dataQuebrada[2] + "" + dataQuebrada[3] + "";
        String mes = dataQuebrada[5] + "" + dataQuebrada[6] + "";
        String dia = dataQuebrada[8] + "" + dataQuebrada[9] + "";

        String dataFormatada = dia + "/" + mes + "/" + ano;
        return dataFormatada;
    }

}
