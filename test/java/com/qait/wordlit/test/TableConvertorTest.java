package com.qait.wordlit.test;

import com.qait.wordilt.constant.WordConstants;
import com.qait.wordilt.converter.*;
import com.qait.wordilt.model.article.Table;
import org.jsoup.Jsoup;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.io.File;

@RunWith(SpringJUnit4ClassRunner.class)
public class TableConvertorTest {

    @InjectMocks
    TableConverter tableConverter;

    @Mock
    SectionConverter sectionConverter;

    @Mock
    SubSectionConverter subSectionConverter;

    @Mock
    AudioConvertor audioConvertor;

    @Mock
    ParagraphConverter paragraphConverter;


    private static Elements elements;

    @Before
    public void init(){
        DocumentToHtmlConverter htmlConverter = new DocumentToHtmlConverter();
        File file = new File("D:\\Projects\\WORD-LIT\\Word-LTI-Service\\src\\test\\resources\\TableTestDoc.docx");
        String htmlString = htmlConverter.convert(file);
        this.elements = Jsoup.parse(htmlString).getElementsByTag(WordConstants.BODY).get(0).children();
      //  audioConvertor.setParagraphTextConverter(new ParagraphConverter());
       // subSectionConverter.setAudioConvertor(audioConvertor);
       // subSectionConverter.setImageConverter(new ImageConverter());
       // sectionConverter.setSubSectionConverter(subSectionConverter);
       // tableConverter.setSectionConverter(sectionConverter);
    }

    @Test
    public void testTable(){
        Table table = tableConverter.convert(elements.get(1));
        Assert.assertTrue(table.isBorder());
        Assert.assertEquals(table.getCellList().size(),2);

    }
}
