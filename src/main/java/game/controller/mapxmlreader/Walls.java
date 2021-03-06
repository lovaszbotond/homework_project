package game.controller.mapxmlreader;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


/**
 * Represents the root element of the xml file used to store the map's walls' position.
 * */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@Data @NoArgsConstructor @AllArgsConstructor
public class Walls {
    List<Wall> wall;
}
