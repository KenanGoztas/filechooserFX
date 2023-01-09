package com.example.filechooserfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;

import java.io.File;
import java.util.List;

public class HelloController {
    @FXML
    private Button moreFiles;

    @FXML
    private Button oneFile;
    @FXML
    private ListView listView;

    @FXML
    void oneFileAction(ActionEvent event) {
        FileChooser fc = new FileChooser();
        fc.setInitialDirectory(new File("/Users/kenangoztas"));
        fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("XML Files", "*.xml"));
        File selectedFile= fc.showOpenDialog(null);
        if (selectedFile !=null){
            listView.getItems().add(selectedFile.getAbsoluteFile());
        }
        else {
            System.out.println("file is not valid");
        }
    }
    @FXML
    void moreFilesAction(ActionEvent event) {
        FileChooser fc = new FileChooser();
        fc.setInitialDirectory(new File("/Users/kenangoztas"));
        fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("XML Files", "*.xml"));
        List<File> selectedFiles= fc.showOpenMultipleDialog(null);
        if (selectedFiles !=null){
            for (File f: selectedFiles) {
                listView.getItems().add(f.getAbsoluteFile());
            }
            }
        else {
            System.out.println("file is not valid");
        }

    }

}