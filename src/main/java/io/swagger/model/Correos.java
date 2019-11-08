package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Correos
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-07T06:35:27.605Z")

public class Correos   {
  @JsonProperty("destinatario")
  private String destinatario = null;

  @JsonProperty("cuerpo")
  private String cuerpo = null;

  @JsonProperty("mensaje")
  private String mensaje = null;

  public Correos destinatario(String destinatario) {
    this.destinatario = destinatario;
    return this;
  }

  /**
   * Get destinatario
   * @return destinatario
  **/
  @ApiModelProperty(value = "")


  public String getDestinatario() {
    return destinatario;
  }

  public void setDestinatario(String destinatario) {
    this.destinatario = destinatario;
  }

  public Correos cuerpo(String cuerpo) {
    this.cuerpo = cuerpo;
    return this;
  }

  /**
   * Get cuerpo
   * @return cuerpo
  **/
  @ApiModelProperty(value = "")


  public String getCuerpo() {
    return cuerpo;
  }

  public void setCuerpo(String cuerpo) {
    this.cuerpo = cuerpo;
  }

  public Correos mensaje(String mensaje) {
    this.mensaje = mensaje;
    return this;
  }

  /**
   * Get mensaje
   * @return mensaje
  **/
  @ApiModelProperty(value = "")


  public String getMensaje() {
    return mensaje;
  }

  public void setMensaje(String mensaje) {
    this.mensaje = mensaje;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Correos correos = (Correos) o;
    return Objects.equals(this.destinatario, correos.destinatario) &&
        Objects.equals(this.cuerpo, correos.cuerpo) &&
        Objects.equals(this.mensaje, correos.mensaje);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinatario, cuerpo, mensaje);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Correos {\n");
    
    sb.append("    destinatario: ").append(toIndentedString(destinatario)).append("\n");
    sb.append("    cuerpo: ").append(toIndentedString(cuerpo)).append("\n");
    sb.append("    mensaje: ").append(toIndentedString(mensaje)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

