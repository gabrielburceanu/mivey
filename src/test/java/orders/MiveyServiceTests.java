package orders;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
@DisplayName("Spring boot 2 mockito2 Junit5 example")
public class MiveyServiceTests {

	//@Spy
	//private ProductService productService = new ProductService();

	@Mock
	private ProductService productService;

	@InjectMocks
	private OrderService orderService;

	@Test
	@DisplayName("Test for order service")
	public void whenUserIdIsProvided_thenRetrievedNameIsCorrect() {

		Mockito.when(productService.getProductName()).thenReturn("Mock Product Name");

		assertEquals("Mock Product Name", orderService.getProductName());
	}
}