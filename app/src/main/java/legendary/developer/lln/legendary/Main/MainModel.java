package legendary.developer.lln.legendary.Main;

import java.util.ArrayList;
import java.util.List;

import legendary.developer.lln.legendary.R;

public class MainModel {

    private final int idImage;
    private final String txtTitle;
    private final String txtDescription;
    private int mPosition;


    public MainModel(int idImage, String txtTitle, String txtDescription, int position) {
        this.idImage = idImage;
        this.txtTitle = txtTitle;
        this.txtDescription = txtDescription;
        this.mPosition = position;
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

    public void incrementPosition() {
        mPosition++;
    }
}
