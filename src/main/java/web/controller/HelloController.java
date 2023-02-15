package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("He//o!");
		messages.add("I`m /Spring MVC application/");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);
		return "HelloController/index";
	}
}

/* Этот код представляет собой Java-класс,
объявленный как контроллер в фреймворке Spring MVC.
Метод printWelcome обрабатывает HTTP GET запросы,
приходящие на корневой путь "/".
Он создает список строк с сообщениями и добавляет его в модель данных
(ModelMap) с именем "messages". Затем он возвращает имя представления "index".

В результате при получении HTTP GET запроса на корневой путь "/",
 метод printWelcome будет вызываться, и сообщения из списка будут добавлены в модель данных,
 которая затем будет использоваться представлением "index" для генерации веб-страницы.*/

/* Модель данных - это объект, который хранит информацию,
которую вы хотите отобразить на веб-странице.
 В этом контексте модель данных хранит список сообщений,
  которые должны быть отображены на веб-странице.

Вы можете добавлять или изменять данные в модели,
и затем использовать эти данные в шаблоне, чтобы отобразить их на веб-странице.
Это позволяет вам динамически менять содержимое
веб-страницы без необходимости изменять сам шаблон.*/

