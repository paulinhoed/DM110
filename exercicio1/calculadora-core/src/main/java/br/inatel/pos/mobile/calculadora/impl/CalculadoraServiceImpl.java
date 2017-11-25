package br.inatel.pos.mobile.calculadora.impl;

import br.inatel.pos.mobile.calculadora.api.CalculadoraService;
import br.inatel.pos.mobile.calculadora.api.Result;

public class CalculadoraServiceImpl implements CalculadoraService{


	@Override
	public Integer getSum(Integer number1, Integer number2) {
		return number1 + number2;
	}

	@Override
	public Integer getSub(Integer number1, Integer number2) {
		return number1 - number2;
	}

	@Override
	public Result doSum(Integer number1, Integer number2) {
		Result result = new Result();
		result.setNumber1(number1);
		result.setNumber2(number2);
		result.setNumberResult(number1 + number2);
		return result;
	}

	@Override
	public Result doSub(Integer number1, Integer number2) {
		Result result = new Result();
		result.setNumber1(number1);
		result.setNumber2(number2);
		result.setNumberResult(number1 - number2);
		return result;
	}

}
