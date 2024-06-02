package com.rlibanez.otherapirest

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class SectionViewModel : ViewModel() {

    private val _sections = MutableStateFlow<List<Section>>(emptyList())
    val sections: StateFlow<List<Section>> = _sections

    fun fetchSections(start: String) {
        viewModelScope.launch {
            val response = RetrofitInstance.api.getSections(start)
            if (response.isSuccessful) {
                response.body()?.let {
                    _sections.value = it
                }
            }
        }
    }
}