import net.sourceforge.tess4j.ITessAPI;
import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.nio.file.Path;

public class Ocr {
    public String ocrThis(Path path){
        ITesseract tesseract = new Tesseract();

        tesseract.setDatapath("/tessdata_best");

        tesseract.setLanguage("eng");
        tesseract.setOcrEngineMode(ITessAPI.TessOcrEngineMode.OEM_TESSERACT_ONLY);
        tesseract.setPageSegMode(ITessAPI.TessPageSegMode.PSM_AUTO);
        try {
            return tesseract.doOCR(path.toFile());
        } catch (TesseractException e) {
            throw new RuntimeException(e);
        }


    }
}
