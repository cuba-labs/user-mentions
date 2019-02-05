package com.company.demo.web;

import com.company.demo.mentionjs.MentionJsExtension;
import com.haulmont.cuba.gui.components.TextArea;
import com.haulmont.cuba.gui.screen.Screen;
import com.haulmont.cuba.gui.screen.Subscribe;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;

import javax.inject.Inject;
import java.util.Arrays;

@UiController("demo_DemoScreen")
@UiDescriptor("demo-screen.xml")
public class DemoScreen extends Screen {
    @Inject
    protected TextArea<String> messageArea;

    @Subscribe
    protected void onInit(InitEvent event) {
        com.vaadin.ui.TextArea vTextArea = messageArea.unwrap(com.vaadin.ui.TextArea.class);

        MentionJsExtension extension = new MentionJsExtension(vTextArea);
        extension.setUsers(Arrays.asList("Peter", "Lilith", "John", "Mathew", "Alex"));
    }
}