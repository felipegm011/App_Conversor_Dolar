package br.com.projeto.controller;

import java.text.DecimalFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.projeto.model.Cotacao;

@Controller
public class CotacaoController {
	
	
	@RequestMapping(value = "/cotacao", method = RequestMethod.GET)
	public ModelAndView catacao(Model model) {
		
		model.addAttribute("cotacao",new Cotacao());
		return new ModelAndView("cotacao");
	}
	
	@RequestMapping(value = "/cotacao", method = RequestMethod.POST)
	public ModelAndView cotação(@ModelAttribute Cotacao cotacao) {
		ModelAndView view = new ModelAndView("cotacao");
		
		view.addObject("mensagem", converteDolar(cotacao.getDolar()));
		
		return view;
	}
	
	
	// metodo para calcular, e formatar entrada e saída do dolar
	public String converteDolar(String d) {
		
		DecimalFormat formated = new DecimalFormat("#0.00");
		
		double convert = Double.parseDouble(d);
		final double v_dolar = 5.56;
		double real = convert * v_dolar;
	
		return (formated.format(real));
	}
}
