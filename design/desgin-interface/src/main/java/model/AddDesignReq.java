package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddDesignReq {

    private String type;

    private Integer bedroomNum;

    private Integer livingRoomNum;

    private Integer bathroomNum;

    private Integer kitchenNum;

    private String provinceCode;

    private String neighborhoodName;

    private String area;

    private String data;

    private String name;

    private StateEnum state;


    public enum StateEnum {
        PUBLIC("public"),

        PRIVATE("private");

        private String value;

        StateEnum(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StateEnum fromValue(String text) {
            for (StateEnum b : StateEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

}
