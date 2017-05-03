import org.junit.Test;

import junit.framework.Assert;

public class FizzBuzzTest {

	@Test
	public void deveRetornarFizzQuandoInformadoTres(){
		String fizz = new FizzBuzz().getFizzBuzzNumero(3);
		Assert.assertEquals("Fizz", fizz);
	}
	
	@Test
	public void deveRetornarBuzzQuandoInformadoCinco(){
		String fizz = new FizzBuzz().getFizzBuzzNumero(5);
		Assert.assertEquals("Buzz", fizz);
	}
	
	@Test
	public void deveRetornaFizzQuandoNumeroMultiplode3(){
		for(int i =3 ; i <= 100; i= i+3){
			if(i % 5 != 0){
				String fizz = new FizzBuzz().getFizzBuzzNumero(i);
				Assert.assertEquals("Fizz", fizz);
			}
		}
	}
	
	@Test
	public void deveRetornaFizzQuandoNumeroMultiplode5(){
		for(int i =5 ; i <= 100; i= i+5){
			if(i % 3 != 0){
				String retorno = new FizzBuzz().getFizzBuzzNumero(i);
				Assert.assertEquals("Buzz", retorno);
			}
		}
	}
	
	@Test
	public void deveRetornaFizzQuandoNumeroMultiplode3e5(){
		for(int i = 1 ; i <= 100; i++){
			if(i % 3 == 0 && i % 5 == 0){
				String retorno = new FizzBuzz().getFizzBuzzNumero(i);
				Assert.assertEquals("FizzBuzz", retorno);
			}
		}
	}
	
	@Test
	public void deveRetornaNumeroQuandoNaoEMultiploDe3e5(){
		for(int i = 1 ; i <= 100; i++){
			if(i % 3 != 0 && i % 5 != 0){
				String retorno = new FizzBuzz().getFizzBuzzNumero(i);
				Assert.assertEquals(String.valueOf(i), retorno);
			}
		}
	}
	
	@Test
	public void deveRetornarFizzQuandoInformadoSeis(){
		String fizz = new FizzBuzz().getFizzBuzzNumero(6);
		Assert.assertEquals("Fizz", fizz);
	}
	
	@Test
	public void deveRetornarNumeroQuandoInformadoSete(){
		String fizz = new FizzBuzz().getFizzBuzzNumero(7);
		Assert.assertEquals("7", fizz);
	}
	
	@Test
	public void deveRetornarFizzBuzzQuandoInformadoQuinze(){
		String fizz = new FizzBuzz().getFizzBuzzNumero(15);
		Assert.assertEquals("FizzBuzz", fizz);
	}
	
}
