package socnet.socnet.DTO.User;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PublicationDTO {

    private int IdPubclication;
    private int AuthorId;
    private int AudioId;
    private int PhotoId;
    private int VideoId;
    private String Text;

    private PublicationDTO(Builder builder) {
        this.IdPubclication = builder.IdPubclication;
        this.AuthorId = builder.AuthorId;
        this.AudioId = builder.AudioId;
        this.PhotoId = builder.PhotoId;
        this.VideoId = builder.VideoId;
        this.Text = builder.Text;
    }

    public static class Builder {

        private int IdPubclication;
        private int AuthorId;
        private int AudioId;
        private int PhotoId;
        private int VideoId;
        private String Text;

        public Builder IdPubclication(int IdPubclication) {
            this.IdPubclication = IdPubclication;
            return this;
        }

        public Builder AuthorId(int AuthorId) {
            this.AuthorId = AuthorId;
            return this;
        }

        public Builder AudioId(int AudioId) {
            this.AudioId = AudioId;
            return this;
        }

        public Builder PhotoId(int PhotoId) {
            this.PhotoId = PhotoId;
            return this;
        }

        public Builder VideoId(int VideoId) {
            this.VideoId = VideoId;
            return this;
        }

        public Builder Text(String Text) {
            this.Text = Text;
            return this;
        }

        public PublicationDTO build() {
            return new PublicationDTO(this);
        }
    }

}
