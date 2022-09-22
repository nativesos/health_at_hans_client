package app.nativesos.healthathansclient.login.ui.viewmodel



import android.util.Patterns

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.regex.Pattern

class LoginViewModel: ViewModel() {

    private val _idPatient = MutableLiveData<String>()
    val idPatient : LiveData<String> = _idPatient

    private val _tokenPatient = MutableLiveData<String>()
    val tokenPatient: LiveData<String> = _tokenPatient

    private val _isValidData = MutableLiveData<Boolean>()
    val isValidData: LiveData<Boolean> = _isValidData

    fun onLoginChange(idPatient: String, tokenPatient: String){
        _idPatient.value    = idPatient
        _tokenPatient.value = tokenPatient
        _isValidData.value  = enableLogin(idPatient = idPatient, tokenPatent = tokenPatient)
    }



    fun enableLogin(idPatient: String, tokenPatent: String)
    = Patterns.PHONE.matcher(idPatient).matches() && tokenPatent.length > 8

}