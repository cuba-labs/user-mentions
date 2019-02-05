package com.company.demo.mentionjs;

import com.haulmont.cuba.web.widgets.WebJarResource;
import com.vaadin.annotations.JavaScript;
import com.vaadin.annotations.StyleSheet;
import com.vaadin.server.AbstractJavaScriptExtension;

import java.util.List;

@JavaScript({
        "vaadin://mentionjs/bootstrap-typeahead.js",
        "vaadin://mentionjs/mention.js",
        "vaadin://mentionjs/mentionjs-extension.js"
})
@StyleSheet("vaadin://mentionjs/bootstrap.min.css")
@WebJarResource({
        "jquery:jquery.min.js"
})
public class MentionJsExtension extends AbstractJavaScriptExtension {
    public MentionJsExtension(com.vaadin.ui.TextArea target) {
        super(target);
    }

    public void setUsers(List<String> logins) {
        getState().logins = logins;
    }

    @Override
    protected MentionJsState getState() {
        return (MentionJsState) super.getState();
    }

    @Override
    protected MentionJsState getState(boolean markAsDirty) {
        return (MentionJsState) super.getState(markAsDirty);
    }
}