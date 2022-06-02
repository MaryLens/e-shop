package example.domain;

import java.util.UUID;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Getter
@ToString
public abstract class AIdentified {

    private UUID uuid;


    public void setUuid(UUID uuid) {
        // HW 2
        if (uuid != null) {
            this.uuid = uuid;
        }
    }

}
