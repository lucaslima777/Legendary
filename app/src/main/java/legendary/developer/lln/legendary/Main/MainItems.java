package legendary.developer.lln.legendary.Main;

import java.util.ArrayList;
import java.util.List;

import legendary.developer.lln.legendary.R;

public class MainItems {

    private final int idImage;
    private final String txtTitle;
    private final String txtDescription;


    public MainItems(int idImage, String txtTitle, String txtDescription) {
        this.idImage = idImage;
        this.txtTitle = txtTitle;
        this.txtDescription = txtDescription;
    }

    public int getIdImage() {
        return idImage;
    }

    public String getTxtTitle() {
        return txtTitle;
    }

    public String getTxtDescription() {
        return txtDescription;
    }
}
