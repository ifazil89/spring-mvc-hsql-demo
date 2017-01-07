/**
 * 
 */
$(function(){
	$("form[name='login']").validate({
	    // Specify validation rules
	    rules: {
	      userName: "required",	      
	      password: {
	        required: true,
	        minlength: 5
	      }
	    },
	    // Specify validation error messages
	    messages: {
	      userName: "Please enter the username",
	      password: {
	        required: "Please provide a password",
	        minlength: "Your password must be at least 5 characters long"
	      }
	    },
	    highlight: function (element, errorClass, validClass) {
	        $(element).closest('.form-group').addClass('has-error');
	    },
	    unhighlight: function (element, errorClass, validClass) {
	        $(element).closest('.form-group').removeClass('has-error');
	    },
	    errorElement: "span",
	    errorClass: "help-block",
	    errorPlacement: function (error, element) {
	        if (element.parent('.input-group').length || element.prop('type') === 'checkbox' || element.prop('type') === 'radio') {
	            error.insertAfter(element.parent());
	        } else {
	            error.insertAfter(element);
	        }
	    },
	    submitHandler: function(form) {
	      form.submit();
	    }
	  });	
	
	function signUpClick(){
		alert("signup clicked..");
	}
});

