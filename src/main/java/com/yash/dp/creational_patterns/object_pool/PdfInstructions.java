package com.yash.dp.creational_patterns.object_pool;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class PdfInstructions implements Poolable {
	private String instructions;
	private String topic;
	private byte[] pdf;

	public PdfInstructions(String instructions, String topic) {
		this.instructions = instructions;
		this.topic = topic;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public void createInstructionsDocument() {
		this.pdf = this.instructions.getBytes();
		try {
			OutputStream outStream = new FileOutputStream(this.topic + "_" + this.instructions.substring(0, 5));
			outStream.write(this.pdf);
			outStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public byte[] getInstructionsPdf() {
		try {
			this.pdf = Files.readAllBytes(Paths.get(this.topic + "_" + this.instructions.substring(0, 5)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return this.pdf;
	}

	@Override
	public void resetPool() {
		this.pdf = null;
	}
}
