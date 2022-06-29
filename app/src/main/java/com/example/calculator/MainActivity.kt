package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.calculator.databinding.ActivityMainBinding
import com.example.calculator.databinding.ActivityMainBinding.inflate
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var mutableList: MutableList<String>
    private var flag: Boolean = false
    private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        mutableList = mutableListOf()
        onNumberClick()
        onEqualClick()
        onOperationClick()
        onDeleteClick()
        onAcClick()
    }

    private fun onAcClick() {
        binding.TvAc.setOnClickListener {
            binding.TvShow.text = ""
            binding.TvResult.text = ""
            mutableList.clear()
        }
    }

    private fun onDeleteClick() {
        binding.TvBackSpace.setOnClickListener {
            viewModel.deleteNumber(binding.TvShow.text.toString())
            binding.TvShow.text = viewModel.liveData.value
        }
    }

    private fun onOperationClick() {
        binding.TvPlus.setOnClickListener {
            mutableList.add(binding.TvShow.text.toString())
            mutableList.add("+")
            flag = true
            binding.TvShow.text = "+"
        }
        binding.TvMinus.setOnClickListener {
            mutableList.add(binding.TvShow.text.toString())
            mutableList.add("-")
            flag = true
            binding.TvShow.text = "-"
        }
        binding.TvMul.setOnClickListener {
            mutableList.add(binding.TvShow.text.toString())
            mutableList.add("*")
            flag = true
            binding.TvShow.text = "x"
        }
        binding.TvDivide.setOnClickListener {
            mutableList.add(binding.TvShow.text.toString())
            mutableList.add("/")
            flag = true
            binding.TvShow.text = "/"
        }

    }

    private fun onEqualClick() {
        binding.TvEqual.setOnClickListener {
            mutableList.add(binding.TvShow.text.toString())
            viewModel.eval(mutableList)
            binding.TvResult.text = viewModel.liveData.value
            binding.TvShow.text = ""
        }
    }

    private fun onNumberClick() {
        binding.TvNumber0.setOnClickListener {
            if (flag) {
                binding.TvShow.text = ""
                flag = false
            }
            binding.TvShow.append("0")
        }

        binding.TvNumber1.setOnClickListener {
            if (flag) {
                binding.TvShow.text = ""
                flag = false
            }
            binding.TvShow.append("1")
        }

        binding.TvNumber2.setOnClickListener {
            if (flag) {
                binding.TvShow.text = ""
                flag = false
            }
            binding.TvShow.append("2")
        }

        binding.TvNumber3.setOnClickListener {
            if (flag) {
                binding.TvShow.text = ""
                flag = false
            }
            binding.TvShow.append("3")
        }

        binding.TvNumber4.setOnClickListener {
            if (flag) {
                binding.TvShow.text = ""
                flag = false
            }
            binding.TvShow.append("4")
        }

        binding.TvNumber5.setOnClickListener {
            if (flag) {
                binding.TvShow.text = ""
                flag = false
            }
            binding.TvShow.append("5")
        }

        binding.TvNumber6.setOnClickListener {
            if (flag) {
                binding.TvShow.text = ""
                flag = false
            }
            binding.TvShow.append("6")
        }

        binding.TvNumber7.setOnClickListener {
            if (flag) {
                binding.TvShow.text = ""
                flag = false
            }
            binding.TvShow.append("7")
        }

        binding.TvNumber8.setOnClickListener {
            if (flag) {
                binding.TvShow.text = ""
                flag = false
            }
            binding.TvShow.append("8")
        }

        binding.TvNumber9.setOnClickListener {
            if (flag) {
                binding.TvShow.text = ""
                flag = false
            }
            binding.TvShow.append("9")
        }

        binding.TvNumber.setOnClickListener {
            if (flag) {
                binding.TvShow.text = ""
                flag = false
            }
            binding.TvShow.append(".")
        }

    }

}

