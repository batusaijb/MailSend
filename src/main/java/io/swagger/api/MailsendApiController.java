package io.swagger.api;

import io.swagger.model.Correos;
import io.swagger.model.PostRsType;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-07T06:35:27.605Z")

@Controller
public class MailsendApiController implements MailsendApi {

    private static final Logger log = LoggerFactory.getLogger(MailsendApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public MailsendApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<PostRsType> enviarCorreo(@ApiParam(value = "Cabecera estándar" ,required=true) @RequestHeader(value="headerRq", required=true) String headerRq,@ApiParam(value = "servIdKallsony" ,required=true) @RequestHeader(value="serviceID", required=true) String serviceID,@ApiParam(value = "Informacion del correo a enviar" ,required=true )  @Valid @RequestBody Correos correo) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PostRsType>(objectMapper.readValue("{  \"confirmacion\" : \"confirmacion\",  \"status\" : {    \"statusDesc\" : \"statusDesc\",    \"statusCode\" : 0  }}", PostRsType.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PostRsType>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PostRsType>(HttpStatus.NOT_IMPLEMENTED);
    }

}
