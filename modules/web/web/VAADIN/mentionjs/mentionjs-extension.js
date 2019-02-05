// entry point of client side code
window.com_company_demo_mentionjs_MentionJsExtension = function () {
    var self = this;
    var textArea = self.getElement(self.getParentId());

    self.onStateChange = function () {
        var logins = this.getState().logins;

        if (logins) {
            var users = [];
            for (var i = 0; i < logins.length; i++) {
                users.push({username: logins[i]});
            }

            $(textArea).mention({
                delimiter: '@',
                users: users
            });
        }
    };
};