package webchat.web;

import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import org.junit.Test;

/**
 * Created by Exidnus on 17.02.2016.
 */

public class HomeControllerTest {

    @Test
    public void shouldGoToHomepage() throws Exception {
        HomeController controller = new HomeController();
        MockMvc mockMvc = standaloneSetup(controller).build();
        mockMvc.perform(get("/")).andExpect(view().name("home"));
        mockMvc.perform(get("/homepage")).andExpect(view().name("home"));
    }
}
