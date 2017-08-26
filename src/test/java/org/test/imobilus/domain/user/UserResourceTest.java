package org.test.imobilus.domain.user;

import org.junit.Test;
import org.springframework.restdocs.mockmvc.MockMvcRestDocumentation;
import org.springframework.restdocs.payload.PayloadDocumentation;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.imobilus.utils.ResourcePaths;
import org.test.imobilus.utils.BaseResourceTest;

public class UserResourceTest extends BaseResourceTest {

    private static final String USER_ID = "Identificador único do usuário.";

    private static final String USER_NAME = "Nome do usuário.";

    @Test
    public void findAll_success() throws Exception {
        mockMvc
                .perform(MockMvcRequestBuilders.get(ResourcePaths.USER_PATH))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(
                        MockMvcRestDocumentation.document("{method-name}",
                                PayloadDocumentation.responseFields(
                                        PayloadDocumentation.fieldWithPath("[].id").description(USER_ID),
                                        PayloadDocumentation.fieldWithPath("[].name").description(USER_NAME)
                                )
                        )
                )
                .andDo(MockMvcResultHandlers.print());

    }

}
